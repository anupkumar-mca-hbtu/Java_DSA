package Stack;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st= new Stack<>();

        for(int i=0;i<s.length();i++) {
            char ch= s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') {
                st.push(ch);
            }
            else if( !st.isEmpty() && (ch==')' && st.peek()=='(' || ch=='}' && st.peek()=='{' || ch==']' && st.peek()=='[') ){
                st.pop();
            }
            else {
                return false;
            }
        }
        return st.isEmpty();
    }
}
public class BalancedParenthesis {
}
