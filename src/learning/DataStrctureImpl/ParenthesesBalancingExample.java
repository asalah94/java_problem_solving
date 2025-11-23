package learning.DataStrctureImpl;

import java.util.Stack;

import static java.lang.Math.exp;
import static java.lang.Math.max;

public class ParenthesesBalancingExample {
    public static void main(String[] args) {
        String exp1 = "[3+(4-9)]";
        System.out.println("Expression " + exp1 + " isBalance : " + isBalanceSymbolInExpression(exp1));
        String exp2 = "(3+45-({4[3-5+3/4]-9)}}]";
        System.out.println("Expression " + exp2 + " isBalance : " + isBalanceSymbolInExpression(exp2));
        String exp3 = "((a+b)+[c-d])";
        System.out.println("Expression " + exp3 + " isBalance : " + isBalanceSymbolInExpression(exp3));
    }
    public static boolean isBalanceSymbolInExpression(String exprssion) {
        Stack<Character> stk = new Stack<Character>();
        if(exprssion == null || exprssion.length() == 0) {
            return false;
        } else {
            for(int i = 0; i < exprssion.length(); i++){

                if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[' ) {
                    stk.push(exprssion.charAt(i));
                } else if(exprssion.charAt(i) == ')' || exprssion.charAt(i) == ']'  ||exprssion.charAt(i) == '}' ) {
                    if (!stk.isEmpty()) {
                        stk.pop();
                    } else {
                        return false;
                    }
                }
            }

            // if stack is empty finally , it means symbol is balance in expression
            if(stk.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
