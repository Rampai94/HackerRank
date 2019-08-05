import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * projecteuler
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/5/2019 inside the package - PACKAGE_NAME
 **/
public class Euler001 {

    /*
    Keeping int instead of long causes wrong answer exception
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] sout = new long[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            sout[a0] = getNaturalSum(n);
        }
        printSum(sout);
    }

    private static long getNaturalSum(int num){
        long sum = 0;

        /*multiples of 3 and 5 form an AP
        therefore natural sum would be
        S3 + S5 - S15
        where Sn = n * (first + last)/2;
*/
        sum = sumOfGp(3, num) + sumOfGp(5, num) - sumOfGp(15, num);
        return sum;
    }


    private static long sumOfGp(int a, int num){
        int first = a;
        /*
        check if num is exact multiple.
        if yes subtract 1 and then divide to get count
        bcoz we have to exclude the number itself.
        else directly divide to get count.
         */
        long count = num%a == 0 ? ((num - 1)/a) : num/a;
        long last = a * count;
        long gpsum = count * (first + last)/2; //Sn = n * (a + Ln)/2
        return gpsum;
    }


    private static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }


    /*
    iterating through all elements causes timeout exception
    private static int getNaturalSum(int num) {
        int j = 0;
        j = IntStream.range(1, num)
                .filter(i -> i % 3 == 0 || i % 5 == 0) // filter out
                .sum();
        return j;
    }*/


    private static void printSum(long[] sumArray) {
        for (long sum : sumArray) {
            System.out.println(sum);
        }
    }
}
