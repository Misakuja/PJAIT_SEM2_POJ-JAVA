package LAB10.LAB10_Ex05;

class Triangle implements Shape {
    int a;
    int b;
    int c;
    int h;

    Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public int calcPerimeter() {
        return a + b + c;
    }

    @Override
    public int calcField() {
        return (a * h) / 2;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
