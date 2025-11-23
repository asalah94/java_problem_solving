package learning.FunctionProgramming.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProblemMediumExamples {

    public static void removeNull(){
        List<String> list = Arrays.asList("Java", "", null, "Python", " ");

        list.stream().filter(s-> s != null && !s.strip().isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void findMax(){
        List<Integer> list = Arrays.asList(2,5,70,8,9,3);

        Optional optional = list.stream().max(Integer::compare);
        System.out.println(optional);
    }


    public static void descending(){
        List<Integer> list = Arrays.asList(2,5,70,8,9,3);

        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static void groupByLength(){
        List<String> names = Arrays.asList("Ahmed", "Ali", "Samar", "Noor");


        Map<Integer, List<String>> length = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(length);
    }

    public static void totalElement(){
        List<String> names = Arrays.asList("Ahmed", "Ali", "Samar", "Noor", "sayed omar");
        names.stream().filter(n->n.length()>3).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static void partitionBy(){
        List<String> names = Arrays.asList("Ahmed", "Ali", "Samar", "Noor", "sayed omar");
        Map<Boolean, List<String>> par = names.stream().collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println(par);
    }

    public static  void findSecondHighest(){
        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 8, 6);
        Optional<Integer> secondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighest.ifPresent(System.out::println);

    }

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
        findSecondHighest();
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
