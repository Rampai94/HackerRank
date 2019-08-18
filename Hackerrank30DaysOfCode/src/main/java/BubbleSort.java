import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/18/2019 inside the package - PACKAGE_NAME
 **/
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        bubblesort(a, n);
    }

    private static void bubblesort(int[] numArr, int n) {
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }

        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + numArr[0]);
        System.out.println("Last Element: " + numArr[numArr.length - 1]);
    }
}
