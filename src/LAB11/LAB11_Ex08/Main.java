package LAB11.LAB11_Ex08;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text.");
        String text = scanner.nextLine();

        System.out.println("Amount of unique symbols in provided text:" + UniqueSymbols.uniqueSymbolCount(text));
    }
}
