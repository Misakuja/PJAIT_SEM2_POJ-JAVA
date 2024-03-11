package Files;
import java.util.Scanner;
public class LAB01_Additional_Ex07 {
    public static void main(String[] args) {
        System.out.println("Provide an integer number.");
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int sum = i * givenNumber;
            System.out.println(i + " * " + givenNumber + " = " + sum);
        }
    }
}
