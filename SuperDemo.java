package Inheritance;
class SuperPrime
{
	String name;
}
public class SuperDemo extends SuperPrime 
{

	String name;
	
	public void details()
	{
		super.name="parent";// it can indicate Superprime class 
		name="Child";
		System.out.println(super.name);
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		SuperDemo sd=new SuperDemo();
		sd.details();

	}

}
