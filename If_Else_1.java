package Lecture_3_Conditional_Statement;

import java.util.Scanner;

/*
 *  Conditional satement in java
 *  
 *  stt1;
 *  stm2;
 *  
 *  if (condition)
 *  {
 *  stt3;
 *  stt4;
 *  }
 *  
 *  else
 *  {
 *  stt5;
 *  stt6;
 *  }
 *  stt7;
 *  stt8;
 */
public class If_Else_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("Adult");
		
		}
		else
		{
			System.out.println("Not Adult");
		}
	}

}





















