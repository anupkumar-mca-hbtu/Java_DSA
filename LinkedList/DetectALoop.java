package LinkedList;

class Node1 {
    int val;
    Node1 next;
    ;
    Node1(int val) {
        this.val=val;
        next=null;
    }
}
public class DetectALoop {

    // This is Floyd’s Tortoise & Hare algorithm
    public static boolean detectLoop(Node1 head) {
        if(head==null || head.next==null) {
            return false;
        }
        Node1 slow= head;
        Node1 fast= head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node1 head= new Node1(1);
        head.next= new Node1(2);
        head.next.next= new Node1(3);
        head.next.next.next=new Node1(4);
        head.next.next.next.next=head;

        boolean res= detectLoop(head);
        System.out.println(res);


    }
}
