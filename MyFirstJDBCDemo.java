package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
Programming Language  					       Data maintain
Java(JDBC API)application               
Programming interface						   Database
Collection of interfaces and classes

*/
public class MyFirstJDBCDemo {

		
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		/*step 1: Register the driver
		  com.mysql.jdbc.Driver
		  com.mysql.cj.jdbc.Driver
		
	      im using MySql data base so i need to install mysql database in my  system
	
	 	  when i will register the driver i need mysql driver
		  reuired the url of Mysql which i install in my system
		
	    	jdbc:mysql://localhost:3306/mysql
		
		   required username and password of mysql */
		
		
		
	
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");//step 1: Register the driver
		
		// step 2:establish connection to mysql
		//JDBC API are the interfaces and classes are available 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		
		// step 3: creating the statement
		
		 Statement stmt=con.createStatement();
		 
		 stmt.execute("insert into emp values(45,'andy',34205)");
		 System.out.println("Employee add hua");
		 con.close();
		 
		 
	}

}
















