import java.util.LinkedList;
import java.util.Scanner;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/21/2019 inside the package - PACKAGE_NAME
 **/
class BinTrNode {
    BinTrNode left, right;
    int data;

    BinTrNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class TraversalBinary {

    private static void levelOrder(BinTrNode root) {
        LinkedList<BinTrNode> queue = new LinkedList<BinTrNode>();
        if (null != root) {
            // enqueue current root
            queue.add(root);

            // while there are nodes to process
            while (!queue.isEmpty()) {
                // dequeue next node
                BinTrNode tree = queue.removeFirst();
                System.out.print(tree.data + " ");
                // enqueue child elements from next level in order
                if (tree.left != null) {
                    queue.add(tree.left);
                }
                if (tree.right != null) {
                    queue.add(tree.right);
                }
            }
        }

    }

    private static BinTrNode insert(BinTrNode root, int data) {
        if (root == null) {
            return new BinTrNode(data);
        } else {
            BinTrNode cur;
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
        BinTrNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
