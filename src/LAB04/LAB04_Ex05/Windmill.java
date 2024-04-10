package LAB04.LAB04_Ex05;
import java.util.Scanner;

public class Windmill {

    public enum Speed {
        SLOW(1),
        MEDIUM(2),
        FAST(3);
        private final int value;
        Speed(int value) {
            this.value = value;
        }
    }
    private Speed speed;
    private boolean on;
    private double radius;
    private String color;

    Windmill() {
        this.speed = Speed.MEDIUM;
        this.on = true;
        this.radius = 10;
        this.color = "white";
    }
    Windmill(Speed speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public void setSpeed(Speed speed) { this.speed = speed; }
    public void turnOnOff(boolean on) { this.on = on; }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void windmillInfo() {
        System.out.println("W I N D M I L L:");
        System.out.print("Speed: ");
        switch (this.speed) {
            case Speed.SLOW -> System.out.print("slow\n");
            case Speed.MEDIUM -> System.out.print("medium\n");
            case Speed.FAST -> System.out.print("fast\n");
        }
        System.out.print("Is it on?: ");
        if (on) System.out.print("yes\n");
        else System.out.print("no\n");
        System.out.println("Windmill radius: " + radius);
        System.out.println("Windmill color: " + color);
    }
    public void changeDataMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("""
                    What would you like to do?:
                    1 - Adjust speed of the windmill.
                    2 - Turn the windmill on, or off.
                    3 - Change the previously input radius of the windmill.
                    4 - Change the previously input color of the windmill
                    5 - Showcase stored information about the windmill.
                    """);
            int inputDecision = scanner.nextInt();
            switch (inputDecision) {
                case 1 -> {
                    while (true) {
                        System.out.println("Adjusting the speed of the windmill. Please input the 1, 2 or 3 accordingly to adjust speed.\n1 - Slow\n2 - Medium\n3 - Fast\n");
                        int speedInput = scanner.nextInt();
                        if (speedInput > 0 && speedInput <= 3) {
                            switch (speedInput) {
                                case 1 -> setSpeed(Speed.SLOW);
                                case 2 -> setSpeed(Speed.MEDIUM);
                                case 3 -> setSpeed(Speed.FAST);
                            }
                            break;
                        }
                        else {
                            System.out.println("Wrong input. Try again.");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Input 0 to turn off the windmill. Input 1 to turn it on.");
                    int onOffInput = scanner.nextInt();
                    scanner.nextLine();
                    boolean isOn = onOffInput == 1;
                    turnOnOff(isOn);
                }
                case 3 -> {
                    System.out.println("Changing the radius of the windmill. Type in the new radius.");
                    double radiusInput = scanner.nextDouble();
                    setRadius(radiusInput);
                }
                case 4 -> {
                    System.out.println("Changing the radius of the windmill. Type in the new color.");
                    String colorInput = scanner.next();
                    setColor(colorInput);
                }
                case 5 -> windmillInfo();
                default -> System.out.println("Wrong input.");
            }
            System.out.println("Would you like to go back to the menu?\n- Input 1 to go back.\n- Input anything else to quit");
        } while (scanner.nextInt() == 1);
        scanner.close();
    }
}
