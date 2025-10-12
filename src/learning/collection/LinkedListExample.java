package learning.collection;

import java.util.*;
import java.util.stream.Stream;

public class LinkedListExample {

    public static void main(String args[]){

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4));
        System.out.println(set1.retainAll(set2)); // intersection: 2,3

    }
}
