package LAB04.LAB04_Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Provide the size of the square's side");
        Scanner scanner = new Scanner(System.in);
        Square square = new Square(scanner.nextDouble());

        System.out.println("Perimeter of the square: " + square.SquarePerimeter());
        System.out.println("Area of the square: " + square.SquareArea());
    }
}
