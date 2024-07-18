package Lab7;
import java.util.Scanner;

public class StringCompareToSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Prompt the user to enter the character sequence to compare
        System.out.print("Enter the character sequence to compare: ");
        String sequence = scanner.nextLine();
        
        // Compare the string to the specified character sequence
        int comparisonResult = inputString.compareTo(sequence);
        
        // Display the result
        if (comparisonResult == 0) {
            System.out.println("The string is equal to the specified character sequence.");
        } else if (comparisonResult < 0) {
            System.out.println("The string is lexicographically less than the specified character sequence.");
        } else {
            System.out.println("The string is lexicographically greater than the specified character sequence.");
        }
        
        scanner.close();
    }
}

