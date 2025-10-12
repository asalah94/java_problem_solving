package learning;

import java.util.*;
import java.util.stream.Collectors;

public class ListProblem {


    public static void evenNumbers(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void toUpperCase(){
        List<String> list = Arrays.asList("ahmed","test","tytut");
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }
    public static void listOfSquare(){
        List<Integer> list = Arrays.asList(2,5,7,8,9,3);
        list.stream().map(s->s*s).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void elementGreater(){
        List<Integer> list = Arrays.asList(2,5,7,8,9,3);
        list.stream().map(s->s>5).collect(Collectors.toList()).forEach(System.out::println);
    }

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


    public static void removeDuplicates(){

        List<Integer> distinct = List.of(1, 2, 2, 3, 3, 3).stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

    }

    public static void sumElement(){
        List<Integer> list = Arrays.asList(2,5,70,8,9,3);
        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println(sum);
    }




    public static void main(String[] args) {

        //ListProblem.evenNumbers();
        //ListProblem.toUpperCase();
        //ListProblem.listOfSquare();
        //ListProblem.elementGreater();
        //ListProblem.removeNull();
        //ListProblem.findMax();
        //ListProblem.descending();
        //ListProblem.groupByLength();
        //ListProblem.limit_skip();
        //ListProblem.removeDuplicates();
        //ListProblem.totalElement();
        //ListProblem.sumElement();
        ListProblem.partitionBy();
    }
}
