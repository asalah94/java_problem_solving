package learning.problemSolving;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringProblems {


    public static String reverseStr(String str) {
        char[] characters = str.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            start++;
            end--;
        }

        return String.valueOf(characters);
    }

    public static StringBuilder removeDublicate(String input) {
        StringBuilder s = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for(char ch : input.toCharArray()){
          if(!seen.contains(ch)){
              seen.add(ch);
              s.append(ch);
          }
        }
        return s;
    }


    public static void countCharOccurrences(String input) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "" + entry.getValue() );
        }
    }

    public static void main(String[] args) {
        String x= StringProblems.reverseStr("ahmed");
        System.out.println(x);

        StringBuilder y= StringProblems.removeDublicate("aahmeedfgggd");
        System.out.println(y);

        StringProblems.countCharOccurrences("aahmeedfgggd");
    }

}
