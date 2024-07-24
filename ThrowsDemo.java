package com.demo;

public class ThrowsDemo 
{
	 void validate(int age) throws ArithmeticException // throws using inside the instance of method
	  {
		  if(age<18)
			  throw new ArithmeticException("The age is not valiid");  // throw instance of class (ArithmeticException)
		  else 
			  System.out.println("ur are eligible for voting");
		  
	  }

	public static void main(String[] args) 
	{
	ThrowDemo td=new ThrowDemo(); // object
		
		try 
		{
		td.validate(12); // calling method
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("A error are solve"); // print
		}
		 
		System.out.println(" me bhi execute ho raha hu");
	}

}
