package Chapter_7_Input;

import java.util.Scanner;

public class Input_1 {

	public static void main(String[] args) {

		// How to  take input
		Scanner sc=new Scanner(System.in);   //
		
		System.out.println("input your age:");
		float age =sc.nextFloat();  //give the input for nextfloat
		System.out.println(age);
		
		System.out.println("input your name:");
		String name=sc.next();  //input string for next using
		System.out.println(name);
		sc.close();
	
	}

}
