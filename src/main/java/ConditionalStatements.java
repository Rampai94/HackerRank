import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/3/2019 inside the package - PACKAGE_NAME
 **/
public class ConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (isWeird(N)) {
            System.out.print("Weird");
        } else {
            System.out.print("Not Weird");
        }
        scanner.close();
    }

    private static boolean isWeird(int n) {
        if (isOdd(n)) {
            return true;
        } else if (isEven(n) && n >= 2 && n <= 5) {
            return false;
        } else return isEven(n) && n >= 6 && n <= 20;
    }

    private static boolean isOdd(int num) {
        return !isEven(num);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
