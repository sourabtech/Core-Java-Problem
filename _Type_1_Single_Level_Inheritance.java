package chapter_opps_3_Inheritance;

class Shaapee1{     //base class
	public void area() {
		System.out.println("displyas Area");
	}
}

class Triangle extends Shaapee1{  //derived class
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
public class _Type_1_Single_Level_Inheritance {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.area(2, 7);
		
	}

}
