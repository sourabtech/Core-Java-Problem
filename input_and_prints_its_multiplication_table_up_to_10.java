package Practice;

import java.util.Scanner;

/*
     Q) Write a Java program that takes a number as input and prints its multiplication table up to 10.
             Test Data:
             Input a number: 8
             Expected Output :
             8 x 1 = 8
             8 x 2 = 16
             8 x 3 = 24
              ...
             8 x 10 = 80
  */
public class input_and_prints_its_multiplication_table_up_to_10 {

	public static void main(String[] args) {
		
   Scanner sc= new Scanner(System.in);
   System.out.println("Input the number: ");
   
   int num=sc.nextInt();
   int i;
   for(i=0;i<10;i++) {
	     System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
	     sc.close();
	 }
   }
}
