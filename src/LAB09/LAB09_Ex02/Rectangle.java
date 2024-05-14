package LAB09.LAB09_Ex02;

class Rectangle extends Figure2D {
    Rectangle(int length, int width) {
        super(new int[]{length, length, width, width});
    }

    @Override
    double calculateTotalArea() {
        return allEdges[0] * allEdges[2];
    }
}
