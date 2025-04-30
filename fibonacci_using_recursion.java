package in.practice;

public class fibonacci_using_recursion {
	  public static void main(String[] args) {
	        int terms = 10; // Display 10 terms of the Fibonacci series
	        System.out.println("Fibonacci Series up to " + terms + " terms:");
	        for (int i = 0; i < terms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }

	    // Recursive method to find Fibonacci number
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
	}
