import java.util.Scanner;

/**
 * Task 9: Calculating the binomial coefficient C(n, k) using recursion.
 *
 * Time Complexity: O(2^n) – Exponential time complexity due to repeated calculations.
 *
 * The function uses the recursive formula C(n, k) = C(n-1, k-1) + C(n-1, k) to calculate the binomial coefficient.
 * The recursion continues until the base cases are reached: C(n, 0) = C(n, n) = 1.
 */
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n and k for C(n, k):");
        int n = sc.nextInt();
        int k = sc.nextInt();

        long startTime = System.nanoTime();


        int result = binomialCoefficient(n, k);

        long endTime = System.nanoTime();


        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("C(" + n + ", " + k + ") = " + result);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to calculate the binomial coefficient C(n, k) using recursion.
     *
     * The function recursively calculates the binomial coefficient using the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
     *
     * @param n The total number of items
     * @param k The number of items to choose
     * @return The binomial coefficient C(n, k)
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
