package com.corejavademo;

	import java.util.Scanner;

	public class AreaCalculate {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose a shape to calculate its area:");
	        System.out.println("1. Square");
	        System.out.println("2. Rectangle");
	        System.out.println("3. Circle");
	        System.out.println("4. Triangle");

	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter the side length of the square: ");
	                double side = scanner.nextDouble();
	                double squareArea = calculateSquareArea(side);
	                System.out.println("Area of the square: " + squareArea);
	                break;
	                
	            case 2:
	                System.out.print("Enter the length of the rectangle: ");
	                double length = scanner.nextDouble();
	                System.out.print("Enter the width of the rectangle: ");
	                double width = scanner.nextDouble();
	                double rectangleArea = calculateRectangleArea(length, width);
	                System.out.println("Area of the rectangle: " + rectangleArea);
	                break;
	                
	            case 3:
	                System.out.print("Enter the radius of the circle: ");
	                double radius = scanner.nextDouble();
	                double circleArea = calculateCircleArea(radius);
	                System.out.println("Area of the circle: " + circleArea);
	                break;
	                
	            case 4:
	                System.out.print("Enter the base length of the triangle: ");
	                double base = scanner.nextDouble();
	                System.out.print("Enter the height of the triangle: ");
	                double height = scanner.nextDouble();
	                double triangleArea = calculateTriangleArea(base, height);
	                System.out.println("Area of the triangle: " + triangleArea);
	                break;
	                
	            default:
	                System.out.println("Invalid choice!");
	        }

	        scanner.close();
	    }

	    public static double calculateSquareArea(double side) {
	        return side * side;
	    }

	    public static double calculateRectangleArea(double length, double width) {
	        return length * width;
	    }

	    public static double calculateCircleArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    public static double calculateTriangleArea(double base, double height) {
	        return 0.5 * base * height;
	    }
	}


