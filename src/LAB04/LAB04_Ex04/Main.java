package LAB04.LAB04_Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius for the circle: ");
        double radiusInput = scanner.nextDouble();

        Circle circle = new Circle(radiusInput);
        circle.printResults();

        System.out.print("Change the radius of the circle: ");
        double radiusInput2 = scanner.nextDouble();
        scanner.close();

        circle.setRadius(radiusInput2);
        circle.printResults();
    }
}
