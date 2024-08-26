package Practice;

import java.util.Scanner;

public class Fahrenheit_to_Celsius_degree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a degree in farenight: ");
		double farenhit = sc.nextDouble();
		
		double celcius =((5*(farenhit - 32.0))/ 9.0);
		System.out.println(farenhit + " degree farenhiet is equal to " + celcius + " in celsius");
	}

}
