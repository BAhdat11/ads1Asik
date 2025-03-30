import java.util.Scanner;

/**
 * Task 2: Calculating the average of array elements using recursion.
 *
 * Time Complexity: O(n) – Each element of the array is processed once.
 */
public class task2 {
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
        double avg = findAverageRecursive(arr, 0, 0);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Average: " + avg);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    /**
     * Function to calculate the average of array elements using recursion.
     *
     * The function sums up the array elements recursively and divides the sum by the number of elements
     * to calculate the average.
     */
    public static double findAverageRecursive(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return (double) sum / arr.length;
        }

        return findAverageRecursive(arr, index + 1, sum + arr[index]);
    }
}
