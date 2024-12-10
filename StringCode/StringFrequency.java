package StringCode;
import java.util.*;

public class StringFrequency {

    public static int firstNonRepeatingChar(String str) {
        HashMap<Character,Integer> hm= new HashMap<>();

        for(int i=0;i<str.length();i++) {
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str.length();i++) {
            if(hm.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String str= "Aabcd";
        int i=firstNonRepeatingChar(str);
        System.out.println(i);
    }
}
