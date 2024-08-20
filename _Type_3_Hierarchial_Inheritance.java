package chapter_opps_3_Inheritance;

class Shaapee3{     //base class
	public void area() {
		System.out.println("displyas Area");
	}
}

class Triangle2 extends Shaapee3{  //derived class of shapee1
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
 class Circle extends Shaapee3{//derived class of shapee1
	 public void area(int r) {
		 System.out.println((3.14)*r*r);
	 }
 }
public class _Type_3_Hierarchial_Inheritance {

	public static void main(String[] args) {

	}

}
