import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/20/2019 inside the package - PACKAGE_NAME
 **/

class BinaryNode {
    BinaryNode left, right;
    int data;

    BinaryNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {

    private static int getHeight(BinaryNode root) {
        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }
        return (heightLeft > heightRight ? heightLeft : heightRight);
    }

    private static BinaryNode insert(BinaryNode root, int data) {
        if (root == null) {
            return new BinaryNode(data);
        } else {
            BinaryNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BinaryNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        assert root != null;
        int height = getHeight(root);
        System.out.println(height);
    }

}