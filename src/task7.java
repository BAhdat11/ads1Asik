import java.util.Scanner;

/**
 * Task 7: Reversing an array without using additional data structures (using recursion).
 *
 * Time Complexity: O(n) – Each element of the array is processed once.
 *
 * This function recursively prints the elements of the array in reverse order.
 * It uses recursion to process the elements from the last one back to the first one.
 */
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long startTime = System.nanoTime();


        printReverse(arr, 0);

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;

        // Output the execution time
        System.out.println("\nExecution time: " + duration + " milliseconds");
    }

    /**
     * Function to recursively print the array elements in reverse order.
     *
     * This function recursively prints elements in reverse, starting from the last element
     * and moving towards the first element.
     *
     * @param arr The array of numbers
     * @param index The current index for printing
     */
    public static void printReverse(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        printReverse(arr, index + 1);
        System.out.print(arr[index] + " ");
    }
}
