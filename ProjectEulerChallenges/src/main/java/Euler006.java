import java.util.Scanner;

/**
 * projecteuler
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/8/2019 inside the package - PACKAGE_NAME
 **/
public class Euler006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] sout = new long[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            sout[a0] = getOutput(n);
        }
        printOutput(sout);
    }

    private static long getOutput(int num) {
        return getSum(num);
    }

    private static long getSum(int num) {
        long sum = 0;
        /* for every i calculate sum of AP first = (i+1) last = num
        very important to keep i as long to get correct answer
        (a + b + c ) ^ n = a ^ n + b ^ n + c ^ n - 2(ab + ac + bc)
        hence, diff = 2(ab + ac + bc)
        since b = a+1 and c = a+2 it is an AP at every stage
        if num = 4, sum = 2*(1(2+3+4) + 2(3+4) + 3*4)
        sum = 2 * [3/2 *(2+4) + 2/2(3+4) + 3*4]
        */
        for (long i = 1; i < num - 1; i++) {
            sum += i * (num - i) * (i + 1 + num);
        }
        sum += 2 * num * (num - 1);
        return sum;
    }

    private static void printOutput(long[] outArray) {
        for (long op : outArray) {
            System.out.println(op);
        }
    }
}
