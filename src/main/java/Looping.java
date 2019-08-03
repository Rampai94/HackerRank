import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/3/2019 inside the package - PACKAGE_NAME
 **/
public class Looping {

        private static void printMultiples(int num){
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(num +" x "+ i+" = "+num*i);
            }
/*            int i = 1;
            while (i<=10){
                System.out.println(num +" x "+ i+" = "+num*i);
                i++;
            }*/
/*            int i = 1;
            do{
                System.out.println(num +" x "+ i+" = "+num*i);
                i++;
            }while(i<=10);*/
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            printMultiples(n);
            scanner.close();
        }
}
