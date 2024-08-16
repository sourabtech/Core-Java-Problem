package Chapter_11_Mini_Project_of_Basic_Java;

import java.util.Scanner;

public class Mini_Project {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int usernumber=0;
		int mynumber=(int)(Math.random()*100);
		
		do {
			System.out.println("Gess my number(1-100)");
			 usernumber = sc.nextInt();
			
			if(usernumber == mynumber) {
				System.out.println("woohoo.. corect number!!");
				break;
			}
			else if(usernumber > mynumber) {
				System.out.println("your number is too long");
			}
			else {
				System.out.println("your number is too small");
			}
		}while(usernumber>=0);
		System.out.println("My number was :");
		System.out.println(mynumber);
		sc.close();
	}

}
