package LAB11.LAB11_Ex01;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

class ListCheck {
    static List<Integer> listDuplicateUsingSet(List<Integer> list) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (Integer i : list) {
            if (set.contains(i)) duplicates.add(i);
            else set.add(i);
        }
        return duplicates;
    }
    static Set<Integer> deleteDuplicates(List<Integer> list) {
        return new HashSet<>(list);
    }
}
