import java.util.Scanner;

/**
 * Task 3: Checking if a number is prime using recursion.
 *
 * Time Complexity: O(sqrt(n)) – We check divisibility up to the square root of n.
 *
 * This function recursively checks whether a number is divisible by any number from 2 up to the square root of n.
 * If it finds any divisor, the number is not prime; otherwise, it is prime.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt to ask the user to input the number to check for primality
        System.out.println("Enter a number to check if it's prime:");
        int n = sc.nextInt();

        // Start measuring execution time
        long startTime = System.nanoTime();

        // Calling the recursive function to check if the number is prime
        boolean isPrime = checkPrimeRecursive(n, 2);

        long endTime = System.nanoTime();

        // Calculate the time taken in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output if the number is prime and the execution time
        System.out.println(n + " is prime: " + isPrime);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to check if a number is prime using recursion.
     *
     * The function recursively checks divisibility of the number starting from 2
     * up to the square root of the number. If any divisor is found, the number is not prime.
     *
     * @param n The number to check
     * @param divisor The current divisor for checking divisibility
     * @return true if the number is prime, false otherwise
     */
    public static boolean checkPrimeRecursive(int n, int divisor) {
        // Base case: if divisor exceeds sqrt(n), the number is prime
        if (divisor > Math.sqrt(n)) {
            return true;
        }

        // If the number is divisible by the current divisor, it is not prime
        if (n % divisor == 0) {
            return false;
        }

        // Recursively check for the next d
        return checkPrimeRecursive(n, divisor + 1);
    }
}
