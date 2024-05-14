package LAB09.LAB09_Ex02;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Provide the length and width values for the rectangle.");

            Rectangle rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());
            System.out.println("Rectangle Total Area: " + rectangle.calculateTotalArea());
            System.out.println("Rectangle Sum of Edges: " + rectangle.sumOfAllEdges());

            System.out.println("Provide the edge value for the square.");

            Square square = new Square(scanner.nextInt());
            System.out.println("Square Total Area: " + square.calculateTotalArea());
            System.out.println("Square Sum of Edges: " + square.sumOfAllEdges());

            System.out.println("Provide the height, length and width values for the cuboid.");
            Cuboid cuboid = new Cuboid(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("Cuboid Total Area: " + cuboid.calculateTotalArea());
            System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
            System.out.println("Cuboid Sum of Edges: " + cuboid.sumOfAllEdges());

            System.out.println("Provide the edge length value for the cube.");
            Cube cube = new Cube(scanner.nextInt());
            System.out.println("Cube Total Area: " + cube.calculateTotalArea());
            System.out.println("Cube Volume: " + cube.calculateVolume());
            System.out.println("Cube Sum of Edges: " + cube.sumOfAllEdges());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
