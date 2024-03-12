package LAB01_Additional;
import java.util.Scanner;
public class LAB01_Additional_Ex06 {
    public static void main(String[] args) {
        System.out.println("Provide two strings to combine.");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String string1 = scan1.next();
        String string2 = scan2.next();

        String combinedString = string1 + string2;
        System.out.println("Combined string: " + combinedString);
    }
}
