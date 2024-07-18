package Lab7;

	import java.util.Scanner;

	public class CharacterAtIndex {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Prompt the user to enter an index
	        System.out.print("Enter an index: ");
	        int index = scanner.nextInt();
	        
	        // Validate the index
	        if (index < 0 || index >= inputString.length()) {
	            System.out.println("Invalid index. Please enter a valid index within the range of the string.");
	        } else {
	            // Get the character at the specified index
	            char characterAtIndex = inputString.charAt(index);
	            System.out.println("Character at index " + index + " is: " + characterAtIndex);
	        }
	        
	        scanner.close();
	    }
	}


