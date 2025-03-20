package Chapter_8_Conditional_Statement;

import java.util.Scanner;

public class Switch_Weeks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the correct weak number:");
       int days=sc.nextInt();
       
       switch(days) {
       case 1:
       System.out.println("Monday");
       break;
       case 2:
           System.out.println("Tuseday");
           break;
       case 3:
           System.out.println("Wensday");
           break;
       case 4:
           System.out.println("Tursday");
           break;
       case 5:
           System.out.println("Friday");
           break;
       case 6:
           System.out.println("Saturday");
           break;
       case 7:
           System.out.println("Sunday");
           break;
       default:
           System.out.println("This is worng Weak Days number");

           sc.close();
       }
	}

}
