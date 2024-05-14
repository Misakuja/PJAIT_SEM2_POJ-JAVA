package LAB09.LAB09_Ex02;

abstract class Figure {
    abstract double calculateTotalArea();
    int[] allEdges;

    Figure(int[] allEdges) {
        for (int edge : allEdges) {
            if (edge <= 0) {
                throw new IllegalArgumentException("Edge length cannot be less or equal to zero.");
            }
        }
        this.allEdges = allEdges;
    }
    int sumOfAllEdges() {
        int sum = 0;
        for (int edge : allEdges) {
            sum += edge;
        }
        return sum;
    }
}
