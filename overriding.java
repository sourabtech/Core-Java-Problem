package chapter_opps_2_polymorphism;
//If subclass (child class) has the same method as declared in 
	//the parent class, it is known as method overriding in Java.
	class animal{
		void veg() {
			System.out.println("It is aveg animal");
		}
	}
		class hen extends animal{
			void veg() {
				System.out.println("It is a veg hen");
			}
		
	}
public class overriding {

	public static void main(String[] args) {
		
		hen hn = new hen();
		hn.veg();
	}

}
