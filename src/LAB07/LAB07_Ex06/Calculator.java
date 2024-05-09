package LAB07.LAB07_Ex06;

class Calculator {
    int first, second, third;

    Calculator(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    protected int calculate(int one) {
        return (int) Math.pow(one, 2);
    }
    protected int calculate(int one, int two) {
        return one * two;
    }
    protected int calculate(int one, int two, int three) {
        return one + two + three;
    }
}
