package Chapter_8_Conditional_Statement;

import java.util.Scanner;

public class For_with_Input {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("print the number" );

		int b ;
		b=sc.nextInt();

		if( b>=1) {
		System.out.println("possible this number " + b);
		
		}	else {
			System.out.println("fails the condition");
		}
		sc.close();

	}

}
