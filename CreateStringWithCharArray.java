package Lab7;

public class CreateStringWithCharArray {
    public static void main(String[] args) {
        // Define a character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        
        // Create a String object from the character array
        String str = new String(charArray);
        
        // Print the String object
        System.out.println("String created from character array: " + str);
    }
}

