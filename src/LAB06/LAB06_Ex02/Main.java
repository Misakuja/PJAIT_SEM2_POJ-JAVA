package LAB06.LAB06_Ex02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions for the first rectangle (one variable):");
        int dimension = scanner.nextInt();
        Rectangle rectangle1 = new Rectangle(dimension);

        System.out.println("Enter the dimensions for the first rectangle (two variables):");
        int dimension1 = scanner.nextInt();
        int dimension2 = scanner.nextInt();
        Rectangle rectangle2 = new Rectangle(dimension1, dimension2);

        System.out.println("Object 1 - one variable");
        rectangle1.field();
        rectangle1.circumference();

        System.out.println("Object 2 - two variables");
        rectangle2.field();
        rectangle2.circumference();
    }
}
