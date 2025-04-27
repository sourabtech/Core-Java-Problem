package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySecoundJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		Connection con = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/springdemo", "root", "root");
		
		Statement stmt=con.createStatement();
		
	    ResultSet rs=stmt.executeQuery("select * from emp");
	    
	    int empid;
	    String empname;
	    String desig;
	    String department;
	    int salary;
	    System.out.println("Employee Details");
	    System.out.println("===========");
	    
	    while(rs.next())
	    {
	    	empid=rs.getInt(1);
	    	empname=rs.getString(2);
	    	desig=rs.getString(3);
	    	department=rs.getString(4);
	    	salary=rs.getInt(5);
	    	
	    	System.out.println(empid+" "+empname+" "+desig+" "+department+" "+salary+"");
	    }
	    con.close();
	   
	
	}

}
