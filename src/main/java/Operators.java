import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/3/2019 inside the package - PACKAGE_NAME
 **/
public class Operators {

    private static final char SEPARATOR = ' ';

    // Complete the solve function below.
    private static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent * 0.01;
        double tax = meal_cost * tax_percent * 0.01;
        double total_cost = meal_cost + tip + tax;

        /*
          This can be done in a variety of ways as shown below:
          A type cast to int also will convert the double to integer
          But that will lead to loss of data
          Because a typecast simply removes digits after decimals
          Sample input:
          10.25
          17
          5
          (int) total_cost - 12.504999999999999 becomes 12 and not 12 - incorrect
          Math.round(total_cost) - 12.504999999999999 becomes 13 - correct but this returns long and not int
          new Double(total_cost).intValue() - 12.504999999999999 becomes 12 - incorrect
          https://javarevisited.blogspot.com/2017/01/how-to-convert-double-to-int-in-java.html
         */
        System.out.println("getIntUsingTypeCast ::" + SEPARATOR + getIntUsingTypeCast(total_cost));

        System.out.println("getIntUsingRound ::" + SEPARATOR + getIntUsingRound(total_cost));

        System.out.println("getIntUsingWrapper ::" + SEPARATOR + getIntUsingWrapper(total_cost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

    private static int getIntUsingTypeCast(double cost) {
        return (int) cost;
    }

    private static int getIntUsingRound(double cost) {
        return (int) Math.round(cost);
    }

    private static int getIntUsingWrapper(double cost) {
        return new Double(cost).intValue();
    }
}
