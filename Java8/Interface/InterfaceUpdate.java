package Java8.Interface;


interface staticDefault {
    public default void wish() {
        System.out.println("Welcome Sir ! Have a nice day");
    }
    public static void greet() {
        System.out.println("Good Morning !");
    }
    public void add(int a,int b);
}
public class InterfaceUpdate implements staticDefault{

    public void add(int a, int b) {
        System.out.println("Sum is : " + (a+b));
    }
    public static void main(String[] args) {
        InterfaceUpdate iup= new InterfaceUpdate();
        iup.add(10,15);
        iup.wish();
        staticDefault.greet();
    }
}
