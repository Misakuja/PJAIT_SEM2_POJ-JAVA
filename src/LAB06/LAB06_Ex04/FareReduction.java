package LAB06.LAB06_Ex04;

enum FareReduction {
    NORMAL(1.0),
    DISCOUNTED(0.5);

    private final double reductionFactor;

    FareReduction(double reductionFactor) {
        this.reductionFactor = reductionFactor;
    }

    public double getReductionFactor() {
        return reductionFactor;
    }
}
