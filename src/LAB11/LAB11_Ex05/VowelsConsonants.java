package LAB11.LAB11_Ex05;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class VowelsConsonants {
    static int countVowels(List<String> list) {
        int count = 0;
        Pattern VOWELS = Pattern.compile("[aeiouy]");

        for (String s : list) {
            Matcher matcher = VOWELS.matcher(s);
            if (matcher.find()) {
                count++;
            }
        }
        return count;
    }
    static int countConsonants(List<String> list) {
        int count = 0;
        Pattern CONSONANTS = Pattern.compile("[bcdfghjklmnpqrstvwxz]");

        for (String s : list) {
            Matcher matcher = CONSONANTS.matcher(s);
            if (matcher.find()) {
                count++;
            }
        }
        return count;
    }

}
