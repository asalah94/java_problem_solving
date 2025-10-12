package learning.FunctionProgramming;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class TwoStream {


    public static void main(String[] args) {
        Integer[] myArr = new Integer[]{10, 20, 30, 40, 33, 578, 9, 7, 3};
        Stream<Integer> myStream = Arrays.stream(myArr);
//
//        Long count = myStream.filter(i -> (i % 2 == 0)).count();
//        System.out.println(count);

        Optional<Integer> sum = myStream.reduce(Integer::sum);
        System.out.println(sum);

        }

}
