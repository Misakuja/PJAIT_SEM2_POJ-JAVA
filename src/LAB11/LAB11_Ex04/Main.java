package LAB11.LAB11_Ex04;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text.");
        String text = scanner.nextLine();

        String[] symbols = text.replaceAll(" ", "").split("");

        System.out.println("Input string array: ");
        System.out.println(Arrays.toString(symbols));

        System.out.println("Output map:");
        System.out.println(IndexBook.indexBookCreate(symbols));
    }
}
