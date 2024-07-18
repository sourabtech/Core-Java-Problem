package Inheritance;

public class ThisClass3 {
    
	void display()
	
	// this.a // invoking current class instance variable
	// this() // invoke current class constructor
	
	
	{
		this.show();//invoke current class method
		System.out.println("dispaly method");
	}
	void show()
	{
		System.out.println("dispaly method 1");
	}
	
	public static void main(String[] args) {
		ThisClass3 ts=new ThisClass3();
		ts.display();
	}

}
