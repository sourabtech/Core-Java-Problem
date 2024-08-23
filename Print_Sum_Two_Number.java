package Practice;

import java.util.Scanner;

public class Print_Sum_Two_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input First number: ");
		int a=sc.nextInt();
		
		System.out.println("Input second number: ");
		int b=sc.nextInt();
		
		System.out.println("Total sum is: ");
		int sum = a+b; 
		System.out.println(sum);
		
		sc.close();
	}

}
