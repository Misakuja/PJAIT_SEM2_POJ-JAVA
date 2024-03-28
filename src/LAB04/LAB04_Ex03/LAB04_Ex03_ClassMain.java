package LAB04.LAB04_Ex03;
import java.util.Scanner;
public class LAB04_Ex03_ClassMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate for Point: ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate for Point: ");
        int y = scanner.nextInt();
        scanner.close();

        LAB04_Ex03_ClassPoint point1 = new LAB04_Ex03_ClassPoint();
        LAB04_Ex03_ClassPoint point2 = new LAB04_Ex03_ClassPoint(x, y);

        System.out.println("Distance between the origin (0,0) and the given point using a method with classic arguments passing is: " + point1.calculateDistance(x, y));

        System.out.println("Distance between the origin (0,0) and the given point using object method is: " + point1.calculateDistanceUsingObject(point2));
    }
}
