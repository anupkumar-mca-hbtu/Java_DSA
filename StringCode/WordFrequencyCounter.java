package StringCode;

import java.util.HashMap;

public class WordFrequencyCounter {

    public static void findWordCount(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word: words) {
         hm.put(word,hm.getOrDefault(word,0)+1);
        }
        for(String key: hm.keySet()) {
            System.out.println(key +" "+hm.get(key));
        }
    }


    public static void main(String[] args) {
        String str= "Java streams are powerful and Java streams are flexible";
        String[] word= str.split(" ");
        findWordCount(word);

    }
}
