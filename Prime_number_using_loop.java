package in.practice;

public class Prime_number_using_loop {
	 public static void main(String[] args) {
	        int num = 29; // You can change this number
	        if (isPrime(num, 2)) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	    }

	    // Helper method to check prime using recursion
	    public static boolean isPrime(int num, int divisor) {
	        if (num <= 2) {
	            return num == 2; // 2 is prime
	        }
	        if (num % divisor == 0) {
	            return false;
	        }
	        if (divisor * divisor > num) {
	            return true;
	        }
	        return isPrime(num, divisor + 1);
	    }
	}
