package LAB11.LAB11_Ex03;

import java.util.HashMap;
import java.util.Map;

class wordOccurrence {
    static Map<String, Integer> wordOccurrenceCounter(String text) {
        Map<String, Integer> wordOccurrence = new HashMap<>();
        String[] words = text.replaceAll("[,.;?!]", "").split("\\s+");

        for(String word : words) {
            wordOccurrence.put(word, wordOccurrence.getOrDefault(word, 0) + 1);
        }
        return wordOccurrence;
    }
}
