package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // step1--> get url
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root"); // step2 ---> Establish Connection
		int empid;
		String empname;
		String desig;
		String  department;
		int salary;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please fill Employee Details");
		
		System.out.println("Enter the empid");
		empid=sc.nextInt();
		
		System.out.println("Enter the empname");
		empname=sc.next();
		
		System.out.println("Enter the Designation");
		desig=sc.next();
		
		System.out.println("Enter the Department");
		department=sc.next();
		
		System.out.println("Enter the salary");
		salary=sc.nextInt();
		
		PreparedStatement pstmt=con.prepareStatement("insert into emp values()");
		
		pstmt.setInt(1, empid);
		pstmt.setString(2, empname);
		pstmt.setString(3, desig);
		pstmt.setString(4, department);
		pstmt.setInt(5, salary);
		
		int i=pstmt.executeUpdate();
		con.close();
		System.out.println(i+"Dekho add hau na");
		
		
		

	}

}
