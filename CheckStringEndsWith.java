package Lab7;
import java.util.Scanner;

public class CheckStringEndsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        
        // Prompt the user to enter the string to check if it ends with
        System.out.print("Enter the string to check if it ends with: ");
        String endsWithString = scanner.nextLine();
        
        // Check if the string ends with the specified string
        boolean endsWith = inputString.endsWith(endsWithString);
        
        // Display the result
        if (endsWith) {
            System.out.println("The string ends with the specified string.");
        } else {
            System.out.println("The string does not end with the specified string.");
        }
        
        scanner.close();
    }
}
