package LAB05.LAB05_Ex03;
import java.util.Random;

class Coin {
    private int attempts;
    private int tailsAmount;
    private int headsAmount;
    private int percentHeads;
    private int percentTails;
    private final Random random;

    Coin() {
        random = new Random();
    }
    public void setAttempts(int attempts) { this.attempts = attempts; }

    public void randomizeResults() {
        for (int i = 0; i < attempts; i++) {
            int randomNumber = random.nextInt(2);
            if (randomNumber == 1) {
                tailsAmount++;
            } else {
                headsAmount++;
            }
        }
        System.out.println("heads: " + headsAmount + " tails: " + tailsAmount);
    }
    public void calcPercent() {
        percentHeads = (headsAmount * 100) / attempts;
        percentTails = 100 - percentHeads;
    }
    public void printResults() {
        System.out.println("Percent of head rolls: " + percentHeads + "%\nPercent of tail rolls: " + percentTails + "%\nAmount of rolls: " + attempts);
    }
}