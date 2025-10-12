package learning.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMeddium {

    public static  void findSecondHighest(){
        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 8, 6);
        Optional<Integer> secondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighest.ifPresent(System.out::println);

    }
    public static void main(String[] args) {
        StreamMeddium.findSecondHighest();

    }


}
