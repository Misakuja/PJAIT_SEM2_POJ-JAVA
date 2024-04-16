package LAB06.LAB06_Ex01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();

        System.out.print("Enter the number of woofs: ");
        int woofs = scanner.nextInt();

        System.out.println("Static method 1:");
        dog.woof();
        System.out.println("Calling method 2 - Overloaded version :");
        dog.woof(woofs);
    }
}
