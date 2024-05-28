package LAB11.LAB11_Ex03;

import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text.");
        String text = scanner.nextLine();

        Map<String, Integer> resultMap = wordOccurrence.wordOccurrenceCounter(text);

        System.out.println(resultMap);

    }
}
