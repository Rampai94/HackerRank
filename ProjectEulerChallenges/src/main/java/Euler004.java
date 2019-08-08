import java.util.Scanner;

/**
 * projecteuler
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/8/2019 inside the package - PACKAGE_NAME
 **/
public class Euler004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] sout = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            sout[a0] = getOutput(n);
        }
        printOutput(sout);
    }

    /*
    Calculate product of two three digit numbers starting from reverse
    If product is palindrome and is greater than previous max
    replace max with product
     */
    private static int getOutput(int num) {
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;
                if (product < num && isPalindrome(product)) {
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    /*
    Use String to check if number is palindrome.
    Same can be done purely using integers
     */
    private static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        StringBuilder strbld = new StringBuilder(str);
        String rev = strbld.reverse().toString();
        return rev.equalsIgnoreCase(str);
    }

    private static void printOutput(int[] sumArray) {
        for (int sum : sumArray) {
            System.out.println(sum);
        }
    }
}
