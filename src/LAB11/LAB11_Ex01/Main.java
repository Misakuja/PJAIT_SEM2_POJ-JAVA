package LAB11.LAB11_Ex01;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.println("How many integers would you like to add to the list?");
        int amount = scanner.nextInt();

        System.out.println("Provide integers for the list:");
        for (int i = 0; i < amount; i++) {
            integerList.add(scanner.nextInt());
        }

        System.out.println("Original List: " + integerList);

        List<Integer> duplicateList = ListCheck.listDuplicateUsingSet(integerList);
        System.out.println("Duplicate List: " + duplicateList);

        Set<Integer> deleteDuplicate = ListCheck.deleteDuplicates(integerList);
        System.out.println("List after deleting duplicates: " + deleteDuplicate);
    }
}
