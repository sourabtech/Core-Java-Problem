package Practice;

import java.util.Scanner;

public class Inches_to_meter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("print the input values in inches: ");
		
		float inch= sc.nextFloat();
		float metter = inch*0.0254f;
		
		System.out.println("value of " + inch + " inch is " + metter + " metter");
		sc.close();
	}

}
