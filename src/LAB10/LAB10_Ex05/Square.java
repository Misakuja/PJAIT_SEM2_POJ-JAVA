package LAB10.LAB10_Ex05;

class Square implements Shape {
    int a;

    Square(int a) {
        this.a = a;
    }

    @Override
    public int calcPerimeter() {
        return a * 4;
    }

    @Override
    public int calcField() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
