package Lecture_2_Variable_Input_Output;

import java.util.Scanner;

// Que. Take 2 variable 'a' and 'b' and print their sum
public class print_sum_using_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();// used to integr value store
		
		int b=sc.nextInt();
		
		int sum= a+b;
		
		System.out.println(sum);
		
	}

}
