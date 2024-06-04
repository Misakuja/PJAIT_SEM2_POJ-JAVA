package LAB12.LAB12_Ex04;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class VowelsCount {
    private static final Pattern VOWELS = Pattern.compile("[AEIOUY]");


    static Map<String, Integer> countVowels(String textInput) {
        Map<String, Integer> vowelsMap = new HashMap<>();
        textInput = textInput.toUpperCase();
        String[] charArray = textInput.replaceAll(" ", "").split("");

        for (String s : charArray) {
            Matcher matcher = VOWELS.matcher(s);
            if (matcher.find()) {
                String vowelNext = matcher.group();
                vowelsMap.put(vowelNext, vowelsMap.getOrDefault(vowelNext, 0) + 1);
            }
        }
        return vowelsMap;
    }

    static String formatMap(Map<String, Integer> map) {
        StringBuilder formattedMap = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            formattedMap
                    .append("\"")
                    .append(entry.getKey())
                    .append("\" -> ")
                    .append(entry.getValue())
                    .append(", ");
        }
        if (formattedMap.length() > 1) {
            formattedMap.setLength(formattedMap.length() - 2);
        }
        formattedMap.append("]");

        return formattedMap.toString();
    }
}
