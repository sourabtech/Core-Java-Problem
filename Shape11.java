package LabProgram;

abstract class Shape1 {
 abstract double calculateArea();
 abstract double calculatePerimeter();
}


class Circle11 extends Shape1 {
 private double radius;

 public Circle11(double radius) {
     this.radius = radius;
 }

 double calculateArea() {
     return Math.PI * radius * radius;
 }

 double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

class Triangle1111 extends Shape1 {
 private double side1;
 private double side2;
 private double side3;

 public Triangle1111(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 public void Triangle111(double ts1, double ts2, double ts3) {
	
	 
 }

public void Triangle (double ts1, double ts2, double ts3) {
	// TODO Auto-generated constructor stub
}

public void Triangle11(double ts1, double ts2, double ts3) {
	// TODO Auto-generated constructor stub
}

double calculateArea() {
     double s = (side1 + side2 + side3) / 2; // Semi-perimeter
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 double calculatePerimeter() {
     return side1 + side2 + side3;
 }
}
public class Shape11 {
 public static void main(String[] args) {
		double r = 4.0;
     Circle11 circle = new Circle11(r);
		double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
     Triangle1111 triangle = new Triangle1111(ts1, ts2, ts3);
     System.out.println("Radius of the Circle"+r);
     System.out.println("Area of the Circle: " + circle.calculateArea());
     System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
		System.out.println("\nSides of the Traiangel are: "+ts1+','+ts2+','+ts3);
     System.out.println("Area of the Triangle: " + triangle.calculateArea());
     System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
 }

double calculatePerimeter() {
	
	return 0;
}

double calculateArea() {
	
	return 0;
}
}

