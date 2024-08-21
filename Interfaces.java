package chapter_opps_4_Abstraction;
 
interface Animal11{
	void walk();   
}

interface Herbivore{
	
}

class Horse1 implements Animal11 , Herbivore{

	@Override
	public void walk() {
System.out.println("walk in 4 legs");		
	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		Horse hr=new Horse();
		hr.walk();
	}

}
