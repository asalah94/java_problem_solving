package learning.JavaPattern;

import java.util.Stack;

public class StackPattern {
    public static void main(String[] args) {
        String s = "(()())";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()){

            if (c == '('){
              st.push('(');
            }
            else if (c == ')'){
                if (st.isEmpty()){
                    System.out.println("invalid");
                    return;
                }
                else {
                    st.pop();
                }
            }



        }

        System.out.println(st.isEmpty() ? "Valid" : "Invalid");

    }}
