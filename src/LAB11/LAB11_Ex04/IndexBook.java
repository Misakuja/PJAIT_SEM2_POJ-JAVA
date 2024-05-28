package LAB11.LAB11_Ex04;

import java.util.*;

class IndexBook {
    static Map<String, Set<Integer>> indexBookCreate(String[] symbols) {
        Map<String, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < symbols.length; i++) {
            String symbol = symbols[i];

            if (!map.containsKey(symbol)) {
                map.put(symbol, new HashSet<>(List.of(i)));
            } else {
                map.get(symbol).add(i);
            }
        }
        return map;
    }
}
