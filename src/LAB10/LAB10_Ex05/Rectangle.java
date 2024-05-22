package LAB10.LAB10_Ex05;

class Rectangle implements Shape {
    int a;
    int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calcPerimeter() {
        return (a * 2) + (b * 2);
    }

    @Override
    public int calcField() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
