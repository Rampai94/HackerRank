import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/16/2019 inside the package - PACKAGE_NAME
 **/
public class PalindromeQS {

    private Stack<Character> stack;
    private LinkedList<Character> queue;

    PalindromeQS(){
        this.queue = new LinkedList<Character>();
        this.stack = new Stack<Character>();
    }

    private void enqueueCharacter(char c){
        queue.addLast(c);
    }

    private void pushCharacter(char c){
        stack.push(c);
    }

    private char popCharacter(){
        return stack.pop();
    }

    private char dequeueCharacter(){
        char c = queue.getFirst();
        queue.removeFirst();
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        PalindromeQS p = new PalindromeQS();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            //System.out.println(p.popCharacter() +" "+ p.dequeueCharacter());
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
