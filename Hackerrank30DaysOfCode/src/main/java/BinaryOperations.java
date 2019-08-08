import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/8/2019 inside the package - PACKAGE_NAME
 **/
public class BinaryOperations {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String bin = Integer.toBinaryString(n);
        int max = getMaxOnes(n);
        System.out.println(max);
        scanner.close();
    }

    private static int getMaxOnes(int num) {
        // Initialize count
        int count = 0;

        /* Count the number of iterations to
            reach num = 0 which is your actual result
         */
        while (num != 0) {
            /* This operation reduces length
             of every sequence of 1s by one.
             */
            num = (num & (num << 1));
            count++;
        }
        return count;
    }
}
