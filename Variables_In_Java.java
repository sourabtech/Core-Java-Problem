package Lecture_2_Variable_Input_Output;

/*
 *      a=25, b=10
 *      2*(a+b)    a+b is variables  2 is constanst
 *      
 */


public class Variables_In_Java {

	public static void main(String[] args) {
		//variables
		int  a=10;
		
		int b=25;
		
		int sum=a+b;
		
		System.out.println(sum);
		
		int mul=a*b;
		System.out.println(mul);
		
		int ans=(a*b)/(b-a);
		System.out.println(ans);

	}

}

/*
 *               Data Types
 *         
 *    Primitive                Non-Primitive 
 *    
 *       byte                      String
 *       Short                     Array
 *       Char                      Class
 *       boolean                   Object
 *       int                       Interface
 *       Long
 *       float
 *       double
 */
