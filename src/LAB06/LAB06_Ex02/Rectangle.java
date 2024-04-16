package LAB06.LAB06_Ex02;

public class Rectangle {
    private int a;
    private int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Rectangle(int var) {
        this.a = var;
        this.b = var;
    }

    public void circumference() {
        int circumference = 2 * (this.a + this.b);
        System.out.println("circumference: " + circumference);
    }
    public void field() {
        int field = this.a * this.b;
        System.out.println("Field: " + field);
    }
}
