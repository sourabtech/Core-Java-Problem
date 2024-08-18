package chapter_opps_1_class_object;
//Java Is Object Orienetd Programming language
//every thing in java is associated with class and object
//Class is not a real-world entity. It is just a template or 
//blueprint or prototype from which objects are created.
//Class does not occupy memory.
//Class is a group of variables of different data types 
//and a group of methods.
/*class contain what?
1.
 data member 
2. member function
3. Constructor
4. nested class

*/	
/*An object is created from a class.
1. An object in Java is a basic unit of Object-Oriented Programming 
and represents real-life entities.
2. Objects are the instances of a class that are created to use the 
attributes and methods of a class.
3. A typical Java program creates many objects, which as you know, 
interact by invoking methods. An object consists of : 

State: It is represented by attributes of an object. 
It also reflects the properties of an object.

Behavior: It is represented by the methods of an object. 
It also reflects the response of an object with other objects.

/*naming convention for declaration of class variable and methods
give meaningful names to class variable and methods*/


class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("writing something");
	}
	public void printcolor() {
		System.out.println(this.color);
	}
	}

class Student{  // class
	String name;
	int age;
	
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// constructor
	
	Student(){ // non-parameterised constructor
		System.out.println("constructor called");
		
	}
	
	Student(String name,int age){ // parameterised constructor
		this.name=name;
		this.age=age;
		
	}
	
}
public class opps_class_object {
	public static void main(String[] args) {
		
		Pen p1=new Pen();
		p1.color="blue";
		p1.type="gel";
		p1.write();
		
		Pen p2=new Pen();
		p2.color="black";
		p2.type="bollpen";
		p1.printcolor();
		p2.printcolor();
		
		
		Student st=new Student();
		st.age=14;
		st.name="sourabh";
		st.printinfo();
		
		Student s1=new Student("sourabh",23);
		s1.printinfo();
	}

}
