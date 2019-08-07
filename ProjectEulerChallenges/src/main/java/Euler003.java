import java.util.Scanner;

/**
 * projecteuler
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/7/2019 inside the package - PACKAGE_NAME
 **/
public class Euler003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] sout = new long[t];
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            sout[a0] = getOutput(n);
        }
        printOutput(sout);
    }

    private static long getOutput(long num) {
        return getLargestPrimeFactor(num);
    }

    //Check if given number is prime
    private static boolean isPrime(long number) {
        long sqrt = (long) Math.sqrt(number);
        for (long i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    Check if num is divisible by i
    If yes check if num/i is prime and return num/i if yes
    Else return i if i is prime
    default return the num itself if no factors are prime
     */
    private static long getLargestPrimeFactor(long number) {
        long max = number;

        long sqrt = (long) Math.sqrt(number);
        for (long i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                if (isPrime(number / i)) {
                    max = number / i;
                } else if (isPrime(i)) {
                    max = i;
                }
            }
        }

        return max;
    }

    private static void printOutput(long[] sumArray) {
        for (long sum : sumArray) {
            System.out.println(sum);
        }
    }
}
