package LAB10.LAB10_Ex05;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[3];

        System.out.println("Enter the length of the square's side:");
        shapes[0] = new Square(scanner.nextInt());
        System.out.println("Enter the lengths of the rectangle's sides:");
        shapes[1] = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter the lengths of the triangle's sides and its height:");
        shapes[2] = new Triangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        for (Shape shapeNext : shapes) {
            System.out.println(shapeNext.toString() + ":");
            System.out.println("Field: " + shapeNext.calcField());
            System.out.println("Perimeter: " + shapeNext.calcPerimeter() + "\n");
        }
    }
}
