package chapter_opps_3_Inheritance;

class Shaapee2{     //base class
	public void area() {
		System.out.println("displyas Area");
	}
}

class Triangle1 extends Shaapee2{  //derived class of shapee1
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
 
class EquilateralTriangle extends Triangle1{  //derived class tringle
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
public class _Type_2_Multi_level_Inheritance {

	public static void main(String[] args) {

	}

}
