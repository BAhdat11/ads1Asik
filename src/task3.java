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

        System.out.println("Enter a number to check if it's prime:");
        int n = sc.nextInt();

        
        long startTime = System.nanoTime();

        boolean isPrime = checkPrimeRecursive(n, 2);

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;
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
        if (divisor > Math.sqrt(n)) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return checkPrimeRecursive(n, divisor + 1);
    }
}
