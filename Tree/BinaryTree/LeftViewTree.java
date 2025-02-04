package Tree.BinaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class LeftViewTree {
    static ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of nodes at current level

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                // Capture the first node of each level
                if (i == 0) {
                    result.add(current.data);
                }

                // Enqueue left child first, then right child
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        ArrayList<Integer> res= leftView(root);
        System.out.println(res);
    }

}
