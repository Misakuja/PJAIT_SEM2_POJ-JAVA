package LAB05.LAB05_Ex03;

import java.util.Scanner;
class Simulator {
    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println("How many attempts?");
        Scanner scanner = new Scanner(System.in);
        coin.setAttempts(scanner.nextInt());
        coin.randomizeResults();
        coin.calcPercent();
        coin.printResults();
    }
}
