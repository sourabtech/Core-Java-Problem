package Lab7;
import java.util.Scanner;

public class StringContainsSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Prompt the user to enter the sequence to check
        System.out.print("Enter the sequence of characters to check: ");
        String sequence = scanner.nextLine();
        
        // Check if the string contains the specified sequence
        boolean containsSequence = inputString.contains(sequence);
        
        // Display the result
        if (containsSequence) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }
        
        scanner.close();
    }
}


