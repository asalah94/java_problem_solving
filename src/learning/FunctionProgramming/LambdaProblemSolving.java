package learning.FunctionProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaProblemSolving {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,30,56,80);

        // Lambda expression for processing the list
        NumberProcessor processor = (list) -> list.stream()
                .filter(n -> n % 2 != 0)        // keep odd numbers
                .map(n -> n * n)               // square them
                .reduce(0, Integer::sum);      // sum them

        int result = processor.process(numbers);
        System.out.println("Result: " + result); // Output: 84
    }
}

