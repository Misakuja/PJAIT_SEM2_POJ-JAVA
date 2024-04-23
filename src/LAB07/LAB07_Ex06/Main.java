package LAB07.LAB07_Ex06;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number.");
        int first = scanner.nextInt();
        System.out.println("Enter the second number.");
        int second = scanner.nextInt();
        System.out.println("Enter the third number.");
        int third = scanner.nextInt();

        Calculator calculator = new Calculator(first, second, third);

        System.out.println("Power: " + calculator.calculate(first));
        System.out.println("Multiply: " + calculator.calculate(first, second));
        System.out.println("Sum: " + calculator.calculate(first, second, third));
    }
}
