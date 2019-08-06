import java.util.Scanner;

/**
 * projecteuler
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/5/2019 inside the package - PACKAGE_NAME
 **/
public class Euler002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] sout = new long[t];
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            sout[a0] = getSum(n);
        }
        printSum(sout);
    }

    private static long getSum(long limit) {
        if (limit < 2) {
            return 0;
        }

        long ef1 = 0, ef2 = 2;
        long sum = ef1 + ef2;

        while (ef2 <= limit) {
            long ef3 = 4 * ef2 + ef1;
            if (ef3 > limit) {
                break;
            }
            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;

        }
        return sum;
    }

    private static void printSum(long[] sumArray) {
        for (long sum : sumArray) {
            System.out.println(sum);
        }
    }
}