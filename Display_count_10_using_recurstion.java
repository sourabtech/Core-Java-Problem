package in.practice;

public class Display_count_10_using_recurstion {

	public static void main(String[] args) {

		// Que) WAP to display count 1 to 10 using recursion?
		
		count(1);
	}

	public static void count(int i) {  // method will be created give parameter
		if(i<=10) {               // condition apply
			System.out.println(i);
			count(i + 1);
		}
		
	}

}
