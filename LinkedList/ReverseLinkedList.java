package LinkedList;

class Node{
    Node next;
    int data;
    Node(int data) {
        this.data= data;
        this.next=null;
    }


}
public class ReverseLinkedList {
    public static Node reverseLinkdList(Node head) {
        Node curr= head;
        Node prev= null;
        Node next_Node= head;
        while(curr!=null) {
             next_Node= curr.next;
            curr.next=prev;
            prev=curr;
            curr= next_Node;

        }
        return prev;

    }
    public static void printLinkiedList(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
 Node head= new Node(1);
 head.next= new Node(2);
 head.next.next= new Node(3);
 head.next.next.next= new Node(4);
 head.next.next.next.next= new Node(5);
 System.out.print("Original Linked List :");
 printLinkiedList(head);
 Node temp=reverseLinkdList(head);
        System.out.print("Reversed Linked List :" );
        printLinkiedList(temp);
    }
}
