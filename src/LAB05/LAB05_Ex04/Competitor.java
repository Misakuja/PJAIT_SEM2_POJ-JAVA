package LAB05.LAB05_Ex04;
import java.util.Scanner;
import java.util.Random;

public class Competitor {
    private String name;
    private int minSpeed;
    private int maxSpeed;
    private int distanceRan;
    private Random random;
    Scanner scanner = new Scanner(System.in);

    Competitor(String name, int minSpeed, int maxSpeed) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.distanceRan = 0;
        this.random = new Random();
    }
    public int getDistanceRan() {
        return distanceRan;
    }
    public String getName() {
        return name;
    }
    public Competitor assignInfo() {
        System.out.println("Provide the competitor's name:");
        String name = scanner.next();
        System.out.println("Provide the min speed of the competitor:");
        int minSpeed = scanner.nextInt();
        System.out.println("Provide the max speed of the competitor:");
        int maxSpeed = scanner.nextInt();
        return new Competitor(name, minSpeed, maxSpeed);
    } //Marcu did this part <3 :)
    Competitor() {
    }
    public void showInfo() {
        System.out.println("Name: " + name + "\nSpeed: " + minSpeed + "-" + maxSpeed + "km/h");
    }
    public void run() {
        int randomNumber = random.nextInt((maxSpeed - minSpeed + 1) + minSpeed);
            distanceRan -= randomNumber;
    }
}
