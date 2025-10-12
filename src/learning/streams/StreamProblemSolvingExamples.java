package learning.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProblemSolvingExamples {

    public static void findFirstEvenGreaterThan10() {
        List<Integer> numbers = Arrays.asList(3, 5, 12, 8, 14, 7);
        numbers.stream()
                .filter(n -> n > 10 && n % 2 == 0)
                .findFirst()
                .ifPresent(n -> System.out.println("First even > 10: " + n));
    }

    public static void convertToUpperAndSort() {
        List<String> names = Arrays.asList("ahmed", "mona", "sara", "tamer");
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Uppercase & Sorted: " + result);
    }

    public static void filterHighSalaryEmployees() {
        List<Employee> employees = Arrays.asList(
                new Employee("Ahmed", 9000),
                new Employee("Salma", 12000),
                new Employee("Hassan", 15000)
        );
        List<String> result = employees.stream()
                .filter(e -> e.getSalary() > 10000)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("High earners: " + result);
    }

    public static void groupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", "IT"),
                new Employee("Nora", "HR"),
                new Employee("Ziad", "IT"),
                new Employee("Mona", "HR")
        );

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        grouped.forEach((dept, list) -> {
            System.out.println(dept + ": " +
                    list.stream().map(Employee::getName).collect(Collectors.toList()));
        });
    }

    public static void wordFrequency() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> freq = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Word count: " + freq);
    }

    public static void sumOfEvenSquares() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("Sum of squares (even): " + sum);
    }

    public static void joinNames() {
        List<String> names = Arrays.asList("Ahmed", "Mona", "Salma");
        String result = names.stream().collect(Collectors.joining(", "));
        System.out.println("Joined names: " + result);
    }

    public static void findDuplicates() {
        List<String> names = Arrays.asList("Ali", "Nora", "Ali", "Nora", "Ziad");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = names.stream()
                .filter(name -> !seen.add(name))
                .collect(Collectors.toSet());
        System.out.println("Duplicates: " + duplicates);
    }

    public static void flatMapNestedList() {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        List<String> flat = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list: " + flat);
    }

    public static void main(String[] args) {
        findFirstEvenGreaterThan10();
        convertToUpperAndSort();
        filterHighSalaryEmployees();
        groupByDepartment();
        wordFrequency();
        sumOfEvenSquares();
        joinNames();
        findDuplicates();
        flatMapNestedList();
    }

    // Helper class
    static class Employee {
        private String name;
        private double salary;
        private String department;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }
    }
}
