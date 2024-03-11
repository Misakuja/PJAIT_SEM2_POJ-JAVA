package Files;

import java.util.Scanner;
public class LAB01_Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Celsius = scan.nextDouble();
        double Fahrenheit = ((9.0/5) * Celsius) + 32;
        System.out.println(Fahrenheit + "F");
    }
}
