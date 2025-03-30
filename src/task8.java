import java.util.Scanner;

/**
 * Task 8: Checking if a string consists only of digits using recursion.
 *
 * Time Complexity: O(n) – Each character in the string is checked once.
 *
 * This function recursively checks if each character in the string is a digit.
 * If a non-digit character is found, it returns false; otherwise, it returns true.
 */
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it's all digits:");
        String s = sc.next();
        long startTime = System.nanoTime();
        boolean isDigits = isAllDigits(s, 0);

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;


        System.out.println(s + " is all digits: " + isDigits);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to check if a string consists only of digits using recursion.
     *
     * This function recursively checks each character in the string. If a non-digit character is found,
     * it returns false. If all characters are digits, it returns true.
     *
     * @param s The string to check
     * @param index The current index for checking the string
     * @return true if the string consists only of digits, false otherwise
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return isAllDigits(s, index + 1);
    }
}
