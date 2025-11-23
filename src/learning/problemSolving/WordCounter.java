package learning.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String sentence = "This is a simple example. Simple examples are great.";

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            // Convert the word to lowercase to make the counting case-insensitive
            String lowercaseWord = word.toLowerCase();

            // Update the count in the map
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
