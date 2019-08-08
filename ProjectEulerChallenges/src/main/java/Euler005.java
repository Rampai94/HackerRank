import java.util.Scanner;

/**
 * projecteuler
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/8/2019 inside the package - PACKAGE_NAME
 **/
public class Euler005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] sout = new long[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            sout[a0] = getOutput(n);
        }
        printOutput(sout);
    }

    /*
    Smallest positive number evenly divisible by all
    previous numbers is the LCM of the previous numbers
     */
    private static long getOutput(int num) {
        return getLcm(num);
    }

    /*
    Set LCM as 1 and then use formula to get final LCM
    LCM(n,n+1) = (n * (n+1))/GCD(n, n+1)
    since we are doing recursion, use previous LCM instead of n.
     */
    private static long getLcm(int num){
        long lcm = 1;
        for(long i = 1; i<num; i++){
            lcm = lcm * (i+1) / getGcd(lcm, i+1);
        }
        return lcm;
    }

    /*
    Subtract smaller number from greater number till
    both are equal. Logic to find GCD.
     */
    private static long getGcd(long i, long j){
        long gcd = 1;
        while(i!=j) {
            if (i > j) {
                i = i - j;
            } else {
                j = j - i;
            }
        }
        return i;
    }

    private static void printOutput(long[] outArray) {
        for (long op : outArray) {
            System.out.println(op);
        }
    }
}
