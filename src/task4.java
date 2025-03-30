import java.util.Scanner;

/**
 * Task 4: Calculating the factorial of a number using recursion.
 *
 * Time Complexity: O(n) – Each number from 1 to n is multiplied once.
 *
 * This function calculates the factorial of a given number recursively by multiplying the number
 * with the factorial of the previous number until the base case (factorial of 1 or 0 is 1) is reached.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number to calculate its factorial:");
        int n = sc.nextInt();

        long startTime = System.nanoTime();


        long factorial = calculateFactorial(n);

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println(n + "! = " + factorial);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to calculate the factorial of a number using recursion.
     *
     * The function multiplies the current number with the factorial of the previous number
     * until the base case is reached (factorial of 1 or 0 is 1).
     *
     * @param n The number to calculate factorial
     * @return The factorial of the number
     */
    public static long calculateFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }
}
