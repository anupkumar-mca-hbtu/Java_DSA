package Stack;



public class StackImplUsingArray {

    int[] stackArr;
    int maxSize;
    int top;

    public StackImplUsingArray(int value) {
        maxSize=value;
        stackArr= new int[maxSize];
        top=-1;
    }

    public void push(int value) {
        if(top==maxSize-1) {
            System.out.println("Stack Overflow");
            return ;
        }
        stackArr[++top]=value;
        System.out.println("Element added is " + value);


    }

    public int pop() {
        if(top==-1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val= stackArr[top--];
        return val;
    }
  public int peek() {

        if(top==-1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArr[top];
  }
    public boolean isEmpty() {
        if(top==-1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        StackImplUsingArray stimpl = new StackImplUsingArray(5);
        stimpl.push(5);
        stimpl.push(7);
        stimpl.push(9);
        int pop1= stimpl.pop();
        System.out.println("Popped element is : " + pop1);
        int peek1= stimpl.peek();
        System.out.println("Top element is : " + peek1);
        int pop2= stimpl.pop();
        System.out.println("Popped element is : " + pop2);
        int peek2= stimpl.peek();
        System.out.println("Top element is : " + peek2);
        int pop3= stimpl.pop();
        System.out.println("Popped element is : " + pop3);
        int peek3= stimpl.peek();
        System.out.println("Top element is : " + peek3);
       boolean stackEmpty= stimpl.isEmpty();
        System.out.println("Stack is Empty : " + stackEmpty);
        stimpl.pop();

    }
}
