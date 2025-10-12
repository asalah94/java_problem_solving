package learning.collection;

import java.util.Stack;

public class StackProblems {

    public static void undo(){
        Stack s = new Stack();
        s.push("ahmed");
        s.push("mohamed");

        s.pop();
        System.out.println(s);
    }

    public static void main(String[] args) {
        StackProblems.undo();
    }
}
