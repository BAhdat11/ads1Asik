import java.util.Scanner;

/**
 * Task 10: Calculating the Greatest Common Divisor (GCD) of two numbers using recursion.
 *
 * Time Complexity: O(log(min(a, b))) – The algorithm divides the numbers in each recursive step.
 *
 * The function uses Euclid's algorithm to calculate the GCD. The algorithm recursively divides the larger number by the smaller number,
 * until one number becomes 0. The other number is the GCD.
 */
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their GCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();


        long startTime = System.nanoTime();

        int result = gcd(a, b);

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;


        System.out.println("GCD(" + a + ", " + b + ") = " + result);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to calculate the GCD (Greatest Common Divisor) of two numbers using Euclid's algorithm.
     *
     * The function recursively divides the larger number by the smaller number until the remainder is 0.
     * The last non-zero remainder is the GCD.
     *
     * @param a The first number
     * @param b The second number
     * @return The GCD of the two numbers
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
