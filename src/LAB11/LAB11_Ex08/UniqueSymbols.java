package LAB11.LAB11_Ex08;

import java.util.*;

class UniqueSymbols {
    static int uniqueSymbolCount(String text) {
        int counter = 0;

        String[] symbols = text.replaceAll(" ", "").split("");

        List<String> allSymbols = new ArrayList<>(Arrays.asList(symbols));
        List<String> duplicates = checkDuplicates(allSymbols);

        for (String symbol : allSymbols) {
            if (!duplicates.contains(symbol)) {
                counter++;
            }
        }
        return counter;
    }

    static List<String> checkDuplicates(List<String> list) {
        List<String> duplicates = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (String s : list) {
            if (set.contains(s)) duplicates.add(s);
            else set.add(s);
        }
        return duplicates;
    }

}
