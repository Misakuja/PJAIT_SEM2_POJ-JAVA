package LAB10.LAB10_Ex06;

class Rectangle implements Shape, Comparable<Shape> {
    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcPerimeter() {
        return (a * 2) + (b * 2);
    }

    @Override
    public double calcField() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

    @Override
    public int compareTo(Shape otherShape) {
        return Double.compare(calcField(), otherShape.calcField());
    }
}
