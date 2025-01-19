package Tree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data= data;
        left=null;
        right=null;
    }
}

public class TreeTraversal {

    public static void preOrder(Node root) {

        if(root==null) {
            return;
        }
        System.out.print( root.data +" -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {

        if(root==null) {
            return;
        }

        inOrder(root.left);
        System.out.print( root.data +" -> ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {

        if(root==null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "->");
    }

    public static void levelOrderTraversal(Node root) {
        if(root==null) {
            return;
        }
        Queue<Node> qe= new LinkedList<>();
        qe.add(root);
        while(!(qe.isEmpty())) {
            Node temp1= qe.poll();
            System.out.print(temp1.data + "->");
            if(temp1.left!=null) {
                qe.add(temp1.left);
            }
            if(temp1.right!=null) {
                qe.add(temp1.right);
            }
        }
    }


    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        System.out.print("PreOrder Traversal is :");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder Traversal is :");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder Traversal is :");
        postOrder(root);
        System.out.println();
        System.out.print("LevelOrder Traversal is :");
        levelOrderTraversal(root);
    }


}
