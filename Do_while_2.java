package Chapter_8_Conditional_Statement;

import java.util.Scanner;

public class Do_while_2 {

	public static void main(String[] args) {
		int number=0;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your number: ");
		 number=sc.nextInt();
		System.out.println("here is your number");
		System.out.println(number);
		}while(number >=0);
		
		System.out.println("THE END");
		sc.close();
	}

}
