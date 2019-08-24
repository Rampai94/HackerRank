import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/23/2019 inside the package - PACKAGE_NAME
 **/
public class Primes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Primes prime = new Primes();
        while (T-- > 0) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}