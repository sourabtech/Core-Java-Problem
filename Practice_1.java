package chapter_opps_3_Inheritance;

class Pen{
	String name;
	String color;
	
	public  void writtin() {
		
		System.out.println("Pen is used to writing in notebook!!!");
				
	}
}

class Sam extends Pen{
	public  void writtin() {
		System.out.println("WE CAN EXTEND THE PEN PROPERTY IN OUR SAM CLASS");
		}
}
public class Practice_1 {

	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.color="red";
		p1.name="Gel";
		p1.writtin();
		
		Sam s1=new Sam();
		s1.writtin();
		
	}

}
