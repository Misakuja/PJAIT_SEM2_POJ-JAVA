package LAB06.LAB06_Ex03;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x-coordinate of the point:");
        int xCoordinate = scanner.nextInt();
        System.out.println("Enter the y-coordinate of the point:");
        int yCoordinate = scanner.nextInt();

        CirclePoint point = new CirclePoint(xCoordinate,yCoordinate);

        System.out.println("Enter the x-coordinate of the circle's middle point:");
        int xCoordinateMiddle = scanner.nextInt();
        System.out.println("Enter the y-coordinate of the circle's middle point:");
        int yCoordinateMiddle = scanner.nextInt();

        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();

        CirclePoint middlePoint = new CirclePoint(xCoordinateMiddle,yCoordinateMiddle);

        Circle circle = new Circle(middlePoint, radius);

        if (circle.isPointInside(point)) {
            System.out.println("The point is inside the circle.");
        } else System.out.println("The point is not inside the circle.");
    }
}
