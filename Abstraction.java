package chapter_opps_4_Abstraction;

abstract class Animal{
	
	abstract void walk() ;
}

class Horse extends Animal{
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}

class Chicken extends Animal{
	public void walk() {
		System.out.println("wals on 2 legs");
	}
}

public class Abstraction {

	public static void main(String[] args) {

		Horse hrs=new Horse();
		hrs.walk();
		
	}

}
