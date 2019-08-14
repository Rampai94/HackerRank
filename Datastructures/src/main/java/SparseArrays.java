import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Datastructures
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/14/2019 inside the package - PACKAGE_NAME
 **/
public class SparseArrays {
    /*
    Set initial count to 0
    Compare strings and increment if a match is found.
     */
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] matches = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            matches[i] = 0;
            for (String string: strings) {
                if (string.equalsIgnoreCase(queries[i])) {
                    matches[i]++;
                }
            }
        }
        return matches;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) /*throws IOException*/ {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i : res) {
           /* bufferedWriter.write(String.valueOf(res[i]));
            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }*/
            System.out.println(i);
        }

       /* bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
