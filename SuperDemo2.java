package Inheritance;
class parentClass 
{
	String name;
	int rollNo;
	parentClass(String name , int rollno)
	{
		
	}
	 public void details()
		{
		  name="Parent";
		  System.out.println(name);
		}
}
public class SuperDemo2 extends parentClass {
	 
	
	SuperDemo2(String name, int rollno) {
		super(name, rollno);
		
	}

	public void details()
		{
		  name="Parent";
		  System.out.println(name);
		}
    
	public static void main(String[] args) {
		

	}

}
