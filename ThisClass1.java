package Inheritance;

public class ThisClass1 {

	      int a;
	      int b;
	      ThisClass1()
	      {
	    	  this.a=10;
	    	  b=20;
	    	  
	      }
	      ThisClass1 get()
	      {
	    	  return this; // this return clss only.
	      }
	      void display()
	      {
	    	  System.out.println(a);
	    	  System.out.println(b); 
	      }
		public static void main(String[] args) {
			ThisClass1 tc=new ThisClass1();
	      //tc.display();
	      tc.get().display();
	     
		}

	}

