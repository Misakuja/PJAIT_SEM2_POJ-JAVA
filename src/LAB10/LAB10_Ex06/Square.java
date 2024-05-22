package LAB10.LAB10_Ex06;

class Square implements Shape, Comparable<Shape> {
    double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    public double calcPerimeter() {
        return a * 4;
    }

    @Override
    public double calcField() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public int compareTo(Shape otherShape) {
        return Double.compare(calcField(), otherShape.calcField());
    }
}
