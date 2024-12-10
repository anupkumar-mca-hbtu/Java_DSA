package StringCode;

import java.util.HashMap;

public class DuplicateWords {

    public static void duplicateFindNaive(String str) {
        String s= str.toLowerCase();
        String[] words= s.split("\\W+");
        for(int i=0;i<words.length;i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
        int count=0;
        for(int i=0;i<words.length;i++) {
            for(int j=i+1;j<words.length;j++) {
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
           // System.out.println(count);
            if(count>0 && !words[i].equals("0")) {
                System.out.print(words[i]+" ");
            }
            count=0;
        }

    }
    public static void findDuplicateOptimal(String str) {

        String s= str.toLowerCase();
        String[] words= s.split("\\W+");
        HashMap<String,Integer> hs= new HashMap<>();
        for(int i=0;i<words.length;i++) {
            hs.put(words[i],hs.getOrDefault(words[i],0)+1);

        }

        for(int i=0;i<words.length;i++) {
             if(hs.get(words[i])>1) {
                 System.out.print(words[i]+" ");
                 hs.put(words[i],0);
                // hs.replace(words[i],0);
             }
        }
        System.out.println(hs);
    }

    public static void main(String[] args) {
        String str= "Boy, Bat, Cricket, Ball, Bat, ball, boy, Tennis, cricket";
        //duplicateFindNaive(str);
        findDuplicateOptimal(str);
    }
}
