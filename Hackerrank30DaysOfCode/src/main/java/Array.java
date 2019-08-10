import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/5/2019 inside the package - PACKAGE_NAME
 **/
public class Array {
    private static final Scanner scanner = new Scanner(System.in);

    private static void printReverse(int [] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        printReverse(arr);

        scanner.close();
    }
}
