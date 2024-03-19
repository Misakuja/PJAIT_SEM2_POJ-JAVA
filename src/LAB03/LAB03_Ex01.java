package LAB03;
import java.util.Scanner;

public class LAB03_Ex01 {
    public static double InputAndDivision() {
        double num1, num2;
        System.out.println("Provide the number to divide.");
        Scanner scan1 = new Scanner(System.in);
        num1 = scan1.nextDouble();

        while(true) {
            System.out.println("Provide the dividing number.");
            Scanner scan2 = new Scanner(System.in);
            num2 = scan2.nextDouble();

            if (num2 == 0) {
                System.out.println("You cannot divide by 0! Input another number");
            } else break;
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        double result = InputAndDivision();
        System.out.println("The result is: " + result);
    }
}

