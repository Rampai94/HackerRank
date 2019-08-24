import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/24/2019 inside the package - PACKAGE_NAME
 **/
public class Penalty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
        sc.close();

        int monthsLate = actualMonth - expectedMonth;
        int daysLate = actualDay - expectedDay;
        int yearDifference = actualYear - expectedYear;


        System.out.println (
                (actualYear - expectedYear > 0 ) ? 10000
                        : (actualMonth - expectedMonth > 0 && yearDifference == 0) ? monthsLate * 500
                        : (actualDay - expectedDay > 0 && yearDifference == 0) ? daysLate * 15
                        : 0
        );
    }
}
