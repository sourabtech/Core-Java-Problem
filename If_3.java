package Chapter_8_Conditional_Statement;

import java.util.Scanner;

public class If_3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//pen=10; notebook=40;
		
		int cash= sc.nextInt();
		System.out.println("Inter your cash:" );
		if(cash<10)
		{
			System.out.println("cannot buy anything");
			System.out.println("get more cash");
		}
		
		else if(cash>10 && cash<40)
			
		{
			System.out.println("can get 1 thing");
		}
		else {
			System.out.println("can get both ");
		}
		
	}

}
