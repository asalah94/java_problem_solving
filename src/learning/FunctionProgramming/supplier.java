package learning.FunctionProgramming;

import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> (int) (Math.random() * 100);
        int result = random.get(); // returns a random number between 0 and 100
        System.out.println(result);
    }
}
