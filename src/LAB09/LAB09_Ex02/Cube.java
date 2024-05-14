package LAB09.LAB09_Ex02;

class Cube extends Figure3D {
    Cube(int sideLength) {
        super(new int[]{sideLength, sideLength, sideLength, sideLength, sideLength, sideLength, sideLength, sideLength});
    }

    @Override
    double calculateTotalArea() {
        return 6 * Math.pow(allEdges[0], 2);
    }

    @Override
    double calculateVolume() {
        return Math.pow(allEdges[0], 3);
    }
}