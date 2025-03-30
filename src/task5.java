import java.util.Scanner;

/**
 * Task 5: Finding the n-th Fibonacci number using recursion.
 *
 * Time Complexity: O(2^n) – Exponential time complexity due to redundant calculations.
 *
 * The function calculates the n-th Fibonacci number recursively by summing the two previous Fibonacci numbers
 * (F(n-1) + F(n-2)) until the base cases (F(0) = 0 and F(1) = 1) are reached.
 */
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Fibonacci number index:");
        int n = sc.nextInt();

        long startTime = System.nanoTime();

        int fibNumber = fibonacci(n);

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Fibonacci(" + n + ") = " + fibNumber);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to calculate the n-th Fibonacci number using recursion.
     *
     * The function recursively calls itself to calculate Fibonacci(n-1) + Fibonacci(n-2),
     * until reaching the base cases (F(0) = 0 and F(1) = 1).
     *
     * @param n The index of the Fibonacci number to calculate
     * @return The n-th Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
