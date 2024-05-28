package LAB11.LAB11_Ex07;

import java.util.ArrayList;
import java.util.List;

class EvenElements {
    static List<String> copyEven(ArrayList<String> originalList) {

        List<String> copyList = new ArrayList<>();
        for (String nextElement : originalList) {
            if (nextElement.length() % 2 == 0) {
                copyList.add(nextElement);
            }
        }
        return copyList;
    }
}