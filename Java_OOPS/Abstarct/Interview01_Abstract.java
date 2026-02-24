package Java_OOPS.Abstarct;

abstract class A {
   A() {
       System.out.println("Abstract class constructor");
   }
}
class B extends A {
    private B() {
        System.out.println("B class constructor");
    }
}
public class Interview01_Abstract {
    public static void main(String[] args) {
       // B b1= new B();

        // B b2= new A(); it will give compile time as A is not converted to B


    }
}
