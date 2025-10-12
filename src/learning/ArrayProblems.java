package learning;

import java.util.*;

public class ArrayProblems {


    public static void findMinMax(int[] arr) {

        int max = 0;
        for(int a : arr){

            if (a> max){
                max = a;
            }
        }
        System.out.println(max);

    }

    public static void reverseArray(int[] arr) {
        int temp;
        int first = 0;
        int last  = arr.length-1;
        while (first  < last){
            temp = arr[first];
            arr[first] =arr[last];
            arr[last] =temp;
            first++;
            last--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));

    }

    public static Object[] removeDuplicates(int[] arr) {
        int [] unique = new int[0];
        Set<Integer> s = new HashSet<>();
        int i = 0;
        for (int a : arr){
            if (! s.contains(a)){
              s.add(a);
            }
        }
        Arrays.stream(s.toArray()).toArray();
        System.out.println(s);
        return s.toArray();
    }

    public static void countFrequencies(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
           map.put(a, map.getOrDefault(a , 0)+1);
        }
        for (Map.Entry<Integer, Integer> x : map.entrySet())
        {
            System.out.println(x.getValue());
        }
    }

        public static void main(String[] args) {
        int []  arr = {1,8,9,70, 70,8,8};
            ArrayProblems.findMinMax(arr);
            ArrayProblems.reverseArray(arr);
            ArrayProblems.removeDuplicates(arr);
            ArrayProblems.countFrequencies(arr);
    }
}
