package LabProgram;
abstract class Employee11{
	  protected String name;
	  protected double baseSalary;

	  public  Employee11(String name, double baseSalary) {
	    this.name = name;
	    this.baseSalary = baseSalary;
	  }

	  public abstract double calculateSalary();

	  public abstract void displayInfo();
	}

	//Manager.java
	class Manager11 extends Employee11 {
	  private double bonus;

	  public Manager11(String name, double baseSalary, double bonus) {
	    super(name, baseSalary);
	    this.bonus = bonus;
	  }

	  @Override
	  public double calculateSalary() {
	    return baseSalary + bonus;
	  }

	  @Override
	  public void displayInfo() {
	    System.out.println("Manager Name: " + name);
	    System.out.println("Base Salary: Rs" + baseSalary);
	    System.out.println("Bonus: Rs" + bonus);
	    System.out.println("Total Salary: Rs" + calculateSalary());
	  }
	}
	//Programmer.java
	class Programmer11 extends Employee11 {
	  private int overtimeHours;
	  private double hourlyRate;

	  public Programmer11(String name, double baseSalary, int overtimeHours, double hourlyRate) {
	    super(name, baseSalary);
	    this.overtimeHours = overtimeHours;
	    this.hourlyRate = hourlyRate;
	  }

	  @Override
	  public double calculateSalary() {
	    return baseSalary + (overtimeHours * hourlyRate);
	  }

	  @Override
	  public void displayInfo() {
	    System.out.println("Programmer Name: " + name);
	    System.out.println("Base Salary: Rs" + baseSalary);
	    System.out.println("Overtime Hours: " + overtimeHours);
	    System.out.println("Hourly Rate: Rs " + hourlyRate);
	    System.out.println("Total Salary: Rs " + calculateSalary());
	  }
	}
	//Main.java
	public class Employee111 {
	  public static void main(String[] args) {
	    Employee11 manager = new Manager11("Corona Cadogan", 6000, 1000);
	    Employee11 programmer = new Programmer11("Sourabh Mane", 5000, 20, 25.0);

	    manager.displayInfo();
	    System.out.println("---------------------");
	    programmer.displayInfo();
	  }
	}

