package ExceptionProgram;

// 1. Write a Java program that throws an exception and catch it using a try-catch block.

public class ExceptionProg1 {

    public static void main(String[] args) {
        try{
            int a= 10/0;
            System.out.println(a);
        } catch(ArithmeticException e) {
            System.out.println("Exception is : "+ e.getMessage());
        }
        finally{
            System.out.println("exception is handled successfully !");
        }
    }
}
