package LabProgram;

 class Animal1 //Parent class Animal
{
 public void move()
 {
     System.out.println("Animal moves");
 }
}


 class Cheetah extends Animal1  //Child class Cheetah
{

 public void move() {
     System.out.println("This cheetah is running");
 }
}
 public class Animal 
 {
 public static void main(String[] args) 
 {
     Animal1 animal = new Animal1();
     animal.move();
     Cheetah cheetah = new Cheetah();
     cheetah.move();
 }
}


	


