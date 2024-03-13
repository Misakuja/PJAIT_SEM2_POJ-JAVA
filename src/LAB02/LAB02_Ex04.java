package LAB02;
import java.util.Scanner;
public class LAB02_Ex04 {
    public static void main(String[] args) {
        System.out.println("Provide a word to check.");
        Scanner scan = new Scanner(System.in);
        String palindromeInput = scan.next();
        int length = palindromeInput.length();

        char[] palindromeArray = new char[length];
        boolean palindrome = true;

        for (int i = 0; i < length; i++) {
            palindromeArray[i] = palindromeInput.charAt(i);
        }
        for (int i = 0; i < length/2; i++) {
            if (palindromeArray[i] != palindromeArray[length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Provided word is a palindrome.");
        } else System.out.println("Provided word is not a palindrome.");
    }
}
