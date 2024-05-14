package LAB09.LAB09_Ex02;

class Cuboid extends Figure3D {
    Cuboid(int length, int width, int height) {
        super(new int[]{length, length, length, length, width, width, width, width, height, height, height, height});
    }

    @Override
    double calculateTotalArea() {
        return (2 * ((allEdges[0] * allEdges[4])) +  (2 * (allEdges[4] * allEdges[8])) + (2 * (allEdges[8] * allEdges[0])));
    }

    @Override
    double calculateVolume() {
        return allEdges[0] * allEdges[4] * allEdges[8];
    }
}
