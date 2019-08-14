import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/14/2019 inside the package - PACKAGE_NAME
 **/
public class StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        StringToInteger sti = new StringToInteger();
        sti.convert(S);
    }

    private void convert(String str){
        try{
            System.out.println(Integer.parseInt(str));
        } catch(NumberFormatException nfe){
            System.out.println("Bad String");
        }
    }
}
