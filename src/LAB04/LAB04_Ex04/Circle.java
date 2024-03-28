package LAB04.LAB04_Ex04;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void printResults() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Diameter: " + getDiameter());
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("Area: " + calculateArea());
    }
}
