package LAB03;

import java.util.Scanner;

public class LAB03_Ex04 {
    public static void stringReverse(String inputString) {
        String[] reversedString = new String[inputString.length()];

        for(int i = 0; i < inputString.length(); i++) {
            reversedString[i] = String.valueOf(inputString.charAt(inputString.length() - i - 1));
        }
        for(int i = 0; i < inputString.length(); i++) {
            System.out.print(reversedString[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Input a word to reverse.");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();
        stringReverse(inputString);
    }
}


