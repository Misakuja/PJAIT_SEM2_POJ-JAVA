package LAB12.LAB12_Ex04;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text.");
        String text = scanner.nextLine();

        System.out.println(VowelsCount.formatMap(VowelsCount.countVowels(text)));
    }
}
