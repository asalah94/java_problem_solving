package learning.problemSolving;

import java.util.Stack;

public class StackProblems {

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
        String exp1 = "[3+(4-9)]";
        System.out.println("Expression " + exp1 + " isBalance : " + isBalanceSymbolInExpression(exp1));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
        else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
        } else {
            return false;
        }
         }
        return stack.isEmpty();

    }

    public static boolean isBalanceSymbolInExpression(String exprssion) {
        Stack<Character> stk = new Stack<Character>();
        if (exprssion == null || exprssion.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < exprssion.length(); i++) {

                if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[') {
                    stk.push(exprssion.charAt(i));
                } else if (exprssion.charAt(i) == ')' || exprssion.charAt(i) == ']' || exprssion.charAt(i) == '}') {
                    if (!stk.isEmpty()) {
                        stk.pop();
                    } else {
                        return false;
                    }
                }
            }

            // if stack is empty finally , it means symbol is balance in expression
            if (stk.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }

}
