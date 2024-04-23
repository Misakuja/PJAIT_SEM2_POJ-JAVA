package LAB02;
import java.util.Scanner;
class LAB02_Ex01 {
    static int radius;
    public static void main(String[] args) {
        System.out.print("Provide the radius for the circle.");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextInt();
        System.out.println("The circle's field is: " + CircleField());
        System.out.println("The circle's circumference is: " + CircleCircumference());
    }
    static int CircleField() {
        return (int)(Math.PI * radius*radius);
    }
    static int CircleCircumference() {
        return (int)(2 * Math.PI * radius);
    }
}