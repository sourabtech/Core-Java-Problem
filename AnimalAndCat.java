package LabProgram;

class Animal11 //Parent class Animal11
{
	public void move()
	{
		System.out.println("Animal are very clam");
	}
}
class Cat extends Animal  // Child class Cat
{
	public void makeSound()
	{
		System.out.println("Cat are  make sound");
	}
}
public class AnimalAndCat 
{
	public static void main(String[] args) 
	{
		Animal11 an=new Animal11();
		an.move();
		Cat ct=new Cat();
		ct.makeSound();
	}

}
