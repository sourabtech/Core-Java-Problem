package LabProgram;

	import java.util.Scanner;
	public class AreandCircumfarance 
	{
			double radius;
    public AreandCircumfarance(double radius) //  Calling Constructor
    {      
        this.radius = radius;                // .this is used here for the ---> refrence of a current class variable
    }
    public double getRadius()
    {        // Method For GET Radius
        return radius;
    }
    public void setRadius(double radius) {         // Method for set the radius 
        this.radius = radius;
    }
    public double calculateArea()
    {                // Method for calculate area
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() 
    {                // Method for  calculate circumference
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();  
        AreandCircumfarance ac = new AreandCircumfarance(radius);     // Creating circle object with User defined radius

        
        System.out.println("Radius of the circle: " + ac.getRadius());
        double area = ac.calculateArea();
        System.out.println("Area of the circle: " + area);

                double circumference = ac.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);        
    }
}

