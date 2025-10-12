package learning.FunctionProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,Integer> parseInt = s->Integer.parseInt(s);
        Integer parsed = parseInt.apply("50");
        System.out.println(parsed);

        Function<String, Integer> length = String::length;
        System.out.println(length.apply("hello"));  // Output: 5

        BiFunction<Integer , Integer ,Integer> incrementByOneAndMultiblyFunction = (a , b) -> (a +1 ) * b;
        System.out.println(incrementByOneAndMultiblyFunction.apply(5,6));
    }
}
