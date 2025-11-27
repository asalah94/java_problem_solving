package learning.JavaPattern;

import java.util.HashMap;

public class HashMapPattern {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char ch :  s.toCharArray()){

            map.put(ch , map.getOrDefault(ch,0) +1);
        }
        System.out.println(map);

    }}