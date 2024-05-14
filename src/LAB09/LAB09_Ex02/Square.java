package LAB09.LAB09_Ex02;

class Square extends Figure2D {
    Square(int a) {
        super(new int[]{a, a, a, a});
    }

    @Override
    double calculateTotalArea() {
        return Math.pow(allEdges[0], 2);
    }
}
