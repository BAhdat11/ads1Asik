import java.util.Scanner;

/**
 * Task1.java
 *
 * Task 1: Finding the minimum element in an array using recursion.
 * The execution time is measured using System.nanoTime() for precise measurement.
 *
 * Time Complexity: O(n) – Each element of the array is examined once.
 */
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long startTime = System.nanoTime();
        int minElement = findMinRecursive(arr, 0);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;


        System.out.println("Minimum element: " + minElement);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Recursive method to find the minimum element in an array.
     *
     * @param arr The array of numbers
     * @param index The current index for checking
     * @return The minimum element of the array
     */
    public static int findMinRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index]; // Base case: return the last element
        }
        int minRest = findMinRecursive(arr, index + 1); // Recursive call for the next element
        return Math.min(arr[index], minRest); // Return the minimum between the current element and the minimum of the rest
    }
}
