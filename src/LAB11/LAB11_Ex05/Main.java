package LAB11.LAB11_Ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text.");
        String text = scanner.nextLine();

        String[] symbols = text.replaceAll(" ", "").split("");

        List<String> symbolList = new ArrayList<>(Arrays.asList(symbols));

        int vowels = VowelsConsonants.countVowels(symbolList);
        int consonants = VowelsConsonants.countConsonants(symbolList);

        System.out.println("Provided text: " + text);
        System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);
    }
}