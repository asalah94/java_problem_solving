package learning;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringProblems {
    public static StringBuilder reverseString(String input) {
        int count = 0;
        input = input.toLowerCase();
        StringBuilder s = new StringBuilder();
        char[]  ch = input.toCharArray();
        for(int i = ch.length-1; i >= 0 ; i--){
            s.append(ch[i]);
        }
        return s;
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
        StringBuilder x= StringProblems.reverseString("ahmed");
        System.out.println(x);

        StringBuilder y= StringProblems.removeDublicate("aahmeedfgggd");
        System.out.println(y);

        StringProblems.countCharOccurrences("aahmeedfgggd");
    }

}
