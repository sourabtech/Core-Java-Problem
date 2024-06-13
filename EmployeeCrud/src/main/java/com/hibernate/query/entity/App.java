package com.hibernate.query.entity;

import java.util.Scanner;

import com.hibernate.crud.Daoimpl.EmployeeDaoImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        char a;
        EmployeeDaoImpl impl = new EmployeeDaoImpl();
        do
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Employee Registration");
        	System.out.println("1.Display 2.Add 3.Edit 4.Delete 5.Exit");
        	System.out.println("Enter your choice");
        	
        	int ch = sc.nextInt();
        	switch(ch)
        	{
        	case 1:
        	{
        		impl.displayEmp();
        		break;
        	}
        	case 2:
        	{
        		impl.addEmp();
        		break;
        	}
        	case 3:
        	{
        		impl.editEmp();
        		break;
        	}
        	case 4:
        	{
        		impl.deleteEmp();
        		break;
        	}
        	case 5:
        	
        		System.exit(0);
        		break;
        	}
        	a=sc.next().charAt(0);
        	}
        	while(a=='Y' || a=='Y');
        	{
        		System.out.println("THANKS");
        	}
        }
    }
 
