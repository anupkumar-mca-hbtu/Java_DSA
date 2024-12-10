package Collection.HashMap;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {


        // Function to find the first non-repeating character in a string.
        static char nonRepeatingChar(String str) {
            // Your code here
            HashMap<Character,Integer> hm= new HashMap<>();

            for(int i=0;i<str.length();i++) {
                hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
            }
            System.out.println(hm);
            for(int i=0;i<str.length();i++) {
                if(hm.get(str.charAt(i))==1){
                    return str.charAt(i);
                }
            }
            return '$';
        }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        char c= nonRepeatingChar(str);
        System.out.println(c);
    }
    }

