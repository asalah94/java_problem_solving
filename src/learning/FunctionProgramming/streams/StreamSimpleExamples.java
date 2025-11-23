package learning.FunctionProgramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSimpleExamples {

    // Count even numbers using Stream.reduce
    public Integer countEven() {
        Integer[] arr = {5, 6, 7, 8, 9, 10};

        return Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .reduce(0, Integer::sum);
    }

    // Count odd numbers properly
    public Long countOdd() {
        Integer[] arr = {5, 6, 7, 8, 9, 10};

        return Arrays.stream(arr)
                .filter(i -> i % 2 == 1)
                .count();
    }

    // Double each number and return list
    public List<Integer> doubleNumbers() {
        Integer[] arr = {5, 6, 7, 8, 9, 10};

        return Arrays.stream(arr)
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    // Filter names starting with a given prefix
    public List<String> filterByPrefix(String prefix) {
        List<String> names = List.of("ahmed", "mohamed", "mahmoud", "sayed", "kamel", "aly");

        return names.stream()
                .filter(s -> s.startsWith(prefix.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Convert all names containing a character to uppercase
    public List<String> uppercaseNamesContaining(String character) {
        List<String> names = List.of("ahmed", "mohamed", "mahmoud", "sayed", "kamel", "aly");

        return names.stream()
                .filter(s -> s.contains(character))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // Get lengths of names
    public List<Integer> getNameLengths() {
        List<String> names = List.of("ahmed", "mohamed", "mahmoud", "sayed", "kamel", "aly");

        return names.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    // Main method to test
    public static void main(String[] args) {

        StreamSimpleExamples ex = new StreamSimpleExamples();

        System.out.println("Even Sum = " + ex.countEven());
        System.out.println("Odd Count = " + ex.countOdd());
        System.out.println("Doubled Numbers = " + ex.doubleNumbers());
        System.out.println("Start with 'a' = " + ex.filterByPrefix("a"));
        System.out.println("Contain 'h' uppercase = " + ex.uppercaseNamesContaining("h"));
        System.out.println("Name lengths = " + ex.getNameLengths());
    }
}
