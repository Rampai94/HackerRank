import java.util.Scanner;
import java.util.Arrays;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/9/2019 inside the package - PACKAGE_NAME
 **/
public class HourGlass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(getOutput(arr));
        scanner.close();
    }

    /*
    Calculate sum for hourglass and put in 1d array
    Using sort method we get the max value as the last element
    Pass n to make this more generic as suggested in discussions
     */
    private static int getOutput(int[][] arr){
        int n = arr.length; // assuming this is a square matrix
        int sum[] = new int[(n-2)*(n-2)];
        int h = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                        + arr[i+2][j+2];
                h++;
            }
        }
        Arrays.sort(sum);
        return sum[(n-2)*(n-2) - 1];
    }
}
