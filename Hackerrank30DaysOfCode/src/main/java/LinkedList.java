import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/13/2019 inside the package - PACKAGE_NAME
 **/
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    Node(int d, Node node) {
        data = d;
        next = node;
    }

}

public class LinkedList {

    /* recursion is the key to this answer
    Check if head is null then initialize head
    If next element is null then only one item in list, initialize next
    If next element is not null, then apply recursion to get tail element
    Initialize last element of the list.
     */
    public static Node insert(Node head, int data) {
        if(head == null){
            return new Node(data);
        } else if (head.next == null) {
            head.next = new Node(data);
        } else {
            insert(head.next, data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();

    }
}
