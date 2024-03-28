package LAB04.LAB04_Ex05;
import java.util.Scanner;

public class Windmill {
    private final int slow = 0;
    private final int medium = 1;
    private final int fast = 2;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Windmill() {
        this.speed = 1;
        this.on = true;
        this.radius = 10;
        this.color = "white";
    }
    Windmill(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void turnOnOff(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void windmillInfo() {
        System.out.println("W I N D M I L L:");
        System.out.print("Speed: ");
        if (this.speed == this.slow) System.out.print("slow\n");
        else if (this.speed == this.medium) System.out.print("medium\n");
        else if(this.speed == this.fast) System.out.print("fast\n");
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
                        System.out.println("Adjusting the speed of the windmill. Please input the 0, 1 or 2 accordingly to adjust speed.\n0 - Slow\n1 - Medium\n2 - Fast\n");
                        int speedInput = scanner.nextInt();
                        if (speedInput >= 0 && speedInput <= 2) {
                            setSpeed(speedInput);
                            break;
                        } else {
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
