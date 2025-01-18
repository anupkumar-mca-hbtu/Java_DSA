package JavaLangPackage.ObjectClassPrac;


public class EqualsMethod {

    public static void main(String[] args) {
        String str1= new String("ABC");
        String str2= new String("ABC");
        String s1= "ABC";
        String s2="ABC";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(s1.hashCode() + "  " + s2.hashCode());
        System.out.println(s1==s2);
    }
}
