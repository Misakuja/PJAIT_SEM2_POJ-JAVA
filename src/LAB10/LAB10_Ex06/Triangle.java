package LAB10.LAB10_Ex06;

class Triangle implements Shape, Comparable<Shape> {
    double a;
    double b;
    double c;
    double h;

    Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calcPerimeter() {
        return a + b + c;
    }

    @Override
    public double calcField() {
        return (a * h) / 2;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public int compareTo(Shape otherShape) {
        return Double.compare(calcField(), otherShape.calcField());
    }
}
