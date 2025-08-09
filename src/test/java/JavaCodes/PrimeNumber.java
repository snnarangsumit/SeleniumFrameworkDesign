package JavaCodes;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 29; // Change this number to check for different values

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    static boolean isPrime(int n) {
      
    	if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If the number is divisible by any number between 2 and sqrt(n), it's not prime
            }
        }

        return true; // If no divisors are found, the number is prime
    }

}



/*
 * 
 * 
 * 
 * 
 * 
 
 This code defines a function isPrime that takes an integer 
 as input and returns a boolean indicating whether it is a prime number.
 The main method demonstrates how to use this function by checking 
 whether a specific number (in this case, 29) is prime. 
 You can change the number variable to test different values.
 

 The isPrime function checks if the given number is divisible
 by any integer from 2 to the square root of the number.
 If it is divisible, the number is not prime; otherwise, 
 it is considered prime. The loop runs up to
 the square root of the number for optimization purposes.
*
*
*
*
*
*
*
*/