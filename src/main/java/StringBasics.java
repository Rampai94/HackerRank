import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/4/2019 inside the package - PACKAGE_NAME
 **/
public class StringBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStrings = scanner.nextInt();
        scanner.skip("(\r\n|[\r\n\u2028\u2029\u0085])?");

        //create an array to store output strings using length of num of Tests
        String [] outarr = new String [numOfStrings];

        //create an output string as per sequence and populate output array
        for (int i = 0; i < numOfStrings; i++) {
            outarr[i] = createString(scanner.nextLine());
        }

        //iterate output array once done
        for (String s : outarr) {
            System.out.println(s);
        }
    }

    /*
    uses a get separator index to fetch index of space char
    set char at separatorIndex as space
    populate kth index if even else populate separatorIndex + 1 + kth index
    i.e. before space if even and after space if odd
    return a new String from the char array thus created
     */
    private static String createString(String sin) {
        char[] soutChars = new char[sin.length() + 1];
        char[] sinChars = sin.toCharArray();
        int separatorIndex = getSeparatorIndex(sin.length());
        soutChars[separatorIndex] = ' ';
        for (int i = 0, k = 0; i < sin.length(); i++,k=i/2) {
            if (isEven(i)) {
                soutChars[k] = sinChars[i];
            } else {
                soutChars[separatorIndex + 1 + k] = sinChars[i];
            }
        }
        return new String(soutChars);
    }

    /*
    return middle location to insert space
    e.g. if sample input is Hacker, length is 6
    sample output will be Hce akr
    space will be at index 6/2 = 3.
    if sample input is Great
    sample output will be Get ra
    space will be at index (5 + 1)/2 = 3 again.
    half if even
    else (len + 1) / 2 if odd
     */
    private static int getSeparatorIndex(int len) {
        if (isEven(len)) {
            return len / 2;
        } else {
            return (len + 1) / 2;
        }
    }

    private static boolean isOdd(int num) {
        return !isEven(num);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
