package StringCode;
import java.util.*;

public class StringReverse {
    public String removeSpaces(String str) {
        char[] arr= new char[str.length()];
        for(int i=0;i<str.length();i++) {
            arr[i]=str.charAt(i);
        }
        String str1=" ";
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==' ') {
                continue;
            }
            else {
                str1=str1+arr[i];
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of String : ");
        String str= sc.nextLine();
//        StringBuffer sb= new StringBuffer(str);
//        String rev=sb.reverse().toString();
//        System.out.println ("Reverse of given String is : " + rev);
        StringReverse sRev= new StringReverse();
        System.out.println(sRev.removeSpaces(str));
        //removeSpaces(str);

    }
}
