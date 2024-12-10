package Collection;

public class HashCode {

    public static void main(String[] args) {
        String str= "AB";
        String str2= new String("AB");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));

    }
}
