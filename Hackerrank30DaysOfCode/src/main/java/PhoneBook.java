import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/6/2019 inside the package - PACKAGE_NAME
 **/
public class PhoneBook {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
