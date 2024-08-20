package chapter_opps_2_polymorphism;


class Student{
	String name;
	int age;
	
	public void printinfo(String name) {  // compiletime function
		System.out.println(name);
	}
	public void printinfo(int age) {  // compiletime
		System.out.println(age);
	}
	
	public void printinfo(String name, int age) {
		System.out.println(name + " " + age);
	}
	
}
public class Function_overloading {

	/*  function overloading
	
	    -same name of  function/method using one class called function overloading 
	    -printinfo is using same function name but different parameter
	*/
	
	
	public static void main(String[] args) {
		
		Student st =new Student();
		st.age=24;
		st.name="sourabh";
		st.printinfo(st.name, st.age);
		
		
	}

}
