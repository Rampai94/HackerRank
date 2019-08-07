import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/7/2019 inside the package - PACKAGE_NAME
 **/
public class Factorial {

    /* Return 1 if n is 0 or 1
       else recursively call n * fact(n-1)
       using the formula n! = n * (n-1)!
     */
    private static int factorial(int n) {
        int fact = 1;
        if(n > 1){
            fact = n * factorial(n-1);
        }
        return fact;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) /*throws IOException */{

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();*/

        scanner.close();
    }

}
