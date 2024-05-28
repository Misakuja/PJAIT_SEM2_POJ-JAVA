package LAB11.LAB11_Ex07;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text.");
        String text = scanner.nextLine();

        String[] words = text.replaceAll("[,.;?!]", "").split("\\s+");
        ArrayList<String> originalList = new ArrayList<>(Arrays.asList(words));

        List<String> copyList = EvenElements.copyEven(originalList);

        System.out.println("Original list: " + originalList);
        System.out.println("Copied list: " + copyList);

    }
}
