package Inheritance;
class Student
{
	int rollNo;
	String name;
	float fee;
	Student(int rollNo ,String name, float fee)// parameter list
	{
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollNo + " " + name  + " " + fee );
	}
}
public class Testclass {

	public static void main(String[] args) {
	Student s1=new Student(1, "sam",1000);
	Student s2=new Student(2, "Judo",2000);
    s1.display();
    s2.display();
	}

}
