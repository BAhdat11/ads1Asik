import java.util.Scanner;

/**
 * Task 6: Calculating the exponentiation (a^n) using recursion.
 *
 * Time Complexity: O(n) – Each recursion multiplies a by itself n times.
 *
 * This function recursively calculates a raised to the power n by multiplying `a` by itself for `n` times.
 * The base case is when n equals 0, and a^0 is defined as 1.
 */
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the base number:");
        int a = sc.nextInt();
        System.out.println("Enter the exponent:");
        int n = sc.nextInt();

        long startTime = System.nanoTime();

        long result = power(a, n);

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println(a + "^" + n + " = " + result);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to calculate a raised to the power n using recursion.
     *
     * The function recursively multiplies `a` for `n` times.
     *
     * @param a The base number
     * @param n The exponent
     * @return The result of a raised to the power of n
     */
    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}
