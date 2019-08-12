import java.util.Arrays;
import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/12/2019 inside the package - PACKAGE_NAME
 **/
class Difference {
    private int[] elements;
    int maximumDifference;

    Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = elements[elements.length - 1] - elements[0];
    }

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
