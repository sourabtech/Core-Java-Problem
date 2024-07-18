package Inheritance;

public class ThisClass {

	   int a;
	   int b;
	   int c;
	   ThisClass()
	   {
		   
		   this(10,12,30);
		   System.out.println("Inside Deafult Constructor");
	   }
	   
	   ThisClass(int a,int b, int c)//parameterized constructor
	   {
		   this.a=a; 
		  this.b=b;
		  this.c=c;
		   System.out.println("Inside the parameterized constructor");
	   }
		
		public static void main(String[] args) 
		{
			ThisClass tc=new ThisClass();
		 // TestClass1 tC=new TestClass1(10,20);
		}

	}

