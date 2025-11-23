package learning.FunctionProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {

    public static void main(String[] args) {

        Consumer<String> printer = s -> System.out.println(s);
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        list.forEach(printer);
    }
}
