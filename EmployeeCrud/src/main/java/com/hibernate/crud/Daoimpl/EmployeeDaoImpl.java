package com.hibernate.crud.Daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.crud.Config.HibernateConfig;
import com.hibernate.crud.Dao.EmployeeDao;
import com.hibernate.crud.entity.Employeeeee;

public class EmployeeDaoImpl implements EmployeeDao
{
	Scanner sc = new Scanner(System.in);

	@Override
	public void addEmp() 
	{
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
		
		String firstName,lastName,designation;
		long  mobileno;
		
		System.out.println("Enter the firstname: ");
		firstName=sc.next();
		System.out.println("Enter the lastName: ");
		lastName=sc.next();
		System.out.println("Enter the designation: ");
		designation=sc.next();
		System.out.println("Enter the mobileno: ");
		mobileno=sc.nextLong();
		
		Employeeeee empp = new Employeeeee();
		
		empp.setFirstName(firstName);
		empp.setLastName(lastName);
		empp.setDesignation(designation);
		empp.setMobileno(mobileno);
		
		session.save(empp);
		ts.commit();
		session.close();
		System.out.println("Employee data have been save Successfully!!");
	}

	@Override
	public void deleteEmp() 
	{
	    Session session = HibernateConfig.getSessionFactory().openSession();
	    Transaction ts = session.beginTransaction();

	    System.out.println("Enter the employee name to delete: ");
	    int employeeeId= sc.nextInt();

	    Employeeeee empToDelete = session.get(Employeeeee.class, employeeeId);
	    if (empToDelete != null) {
	        session.delete(empToDelete);
	        ts.commit();
	        System.out.println("Employee with ID " + employeeeId + " has been deleted.");
	    } else {
	        System.out.println("Employee with ID " + employeeeId + " not found.");
	    }

	    session.close();
	}


	@Override
	public void editEmp() {
	    Session session = HibernateConfig.getSessionFactory().openSession();
	    Transaction ts = session.beginTransaction();

	    System.out.println("Enter the employee ID to edit: ");
	    int employeeId = sc.nextInt();

	    Employeeeee empToEdit = session.get(Employeeeee.class, employeeId);
	    if (empToEdit != null) {
	        boolean isEditing = true;
	        while (isEditing) {
	            System.out.println("Select the field to edit:");
	            System.out.println("1. First Name");
	            System.out.println("2. Last Name");
	            System.out.println("3. Designation");
	            System.out.println("4. Mobile Number");
	            System.out.println("5. Exit");

	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the new first name: ");
	                    String newFirstName = sc.nextLine();
	                    empToEdit.setFirstName(newFirstName);
	                    break;
	                case 2:
	                    System.out.println("Enter the new last name: ");
	                    String newLastName = sc.nextLine();
	                    empToEdit.setLastName(newLastName);
	                    break;
	                case 3:
	                    System.out.println("Enter the new designation: ");
	                    String newDesignation = sc.nextLine();
	                    empToEdit.setDesignation(newDesignation);
	                    break;
	                case 4:
	                	System.out.println("Enter the new mobile number: ");
	                	long newMobileNumber = sc.nextLong();
	                	empToEdit.setMobileno(newMobileNumber); // Corrected variable name
                        break;
	                case 5:
	                    isEditing = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                    break;
	            }
	        }

	        session.update(empToEdit);
	        ts.commit();
	        System.out.println("Employee with ID " + employeeId + " has been updated.");
	    } else {
	        System.out.println("Employee with ID " + employeeId + " not found.");
	    }

	    session.close();
	}


	@Override
	public void displayEmp() 
	{
	    Session session = HibernateConfig.getSessionFactory().openSession();
	    List<Employeeeee> employees = session.createQuery("FROM Employeeeee", Employeeeee.class).list();
	    session.close();

	    System.out.println("Employee List:");
	    for (Employeeeee emp : employees) {
	    
	        System.out.println("First Name: " + emp.getFirstName());
	        System.out.println("Last Name: " + emp.getLastName());
	        System.out.println("Designation: " + emp.getDesignation());
	        System.out.println("Mobile Number: " + emp.getMobileno());
	        System.out.println();
	    }
	}

	

}
