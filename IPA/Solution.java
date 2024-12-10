package IPA;

public class Solution {
    public static void main(String[] args) {
        String str= "Xplore";
        int count=0;
        for(int i=0;i<str.length();i++) {
            char ch= str.charAt(i);

            if(ch>='a'&& ch<='z') {
                count++;
            }
        }
        if(count==0) {
            System.out.println("No lower case found");
        }
        else {
            System.out.println(count);
        }
    }
}
