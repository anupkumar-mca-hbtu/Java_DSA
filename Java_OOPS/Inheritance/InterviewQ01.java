package Java_OOPS.Inheritance;

class A {
//    void getName() {
//        System.out.println("A class method executed");
//    }
static void getName() {
    System.out.println("A class method executed");
}
}
  class B extends A {
      static void getName() {
          System.out.println("B class method executed");
      }
  }

public class InterviewQ01 {
    public static void main(String[] args) {
        A a1= new A();
        a1.getName();
        A a2= new B();
        a2.getName();

        B b1= new B();
        b1.getName();

        // B b2= new A(); it will give compile time as A is not converted to B


    }
}
