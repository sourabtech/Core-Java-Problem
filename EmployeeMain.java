package Inheritance;
//Manager is-a employee
class Employee
{
	public int salary;  // atribute of employee class
	
	
	public Employee(int sal)// special type of method// constructor
	{
		salary =sal;
	}
	public void work()//method of employee class
	{
		System.out.println("working as a employee");
	}
	public int getSalary()
	{
		return salary;
	}
	
}
class Manager extends Employee
{
	public Manager (int sal)
	{
		super(sal);
	}
	
	public void work ()
	{
		System.out.println("Managing the employee");
	}
	public void addEmployee()
	{
		System.out.println("Adding the new employee");
	}
}

public class EmployeeMain 
{

	public static void main(String[] args)
	{
	  Employee emp=new Employee(40000);	
      Manager man=new Manager(75000);
      
      emp.work();
      System.out.println("Employee salary " + emp.getSalary());
      
      man.work();
      System.out.println("Employee salary " + man.getSalary());
	  man.addEmployee();
	}

}






