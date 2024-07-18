package Inheritance;
// IS-A relationship
// has-a relationship

//car is-a vehical
//student is-a person
//faculty is-a person
//employee is-a person  


/*employee  department
  show the number of employee working in IT department
  */
 

 class Vehical {
	String brand="Maruti"; // vehical attribute
	private String modelName;
	
	public void honk()  // vehical method
	{
		System.out.println("beep beep!....");
	}
	
	public class Car extends Vehical
	{
	 String modelName="Maruti800";   // car attribute
	}

	public static void main(String[] args) 
	{
		Vehical mycar=new Vehical(); 
		mycar.honk(); // call the honk () method (from the vehicl class) and on the mycar object
		System.out.println(mycar.brand +" "+mycar.modelName);
		
	}

}
