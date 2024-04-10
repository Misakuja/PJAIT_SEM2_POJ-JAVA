package LAB05.LAB05_Ex01;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int minValue;
    private int maxValue;
    private int randomNumber;
    private int userInput;
    private final Random random;
    private final Scanner scanner;
    Game() {
        random = new Random();
        scanner = new Scanner(System.in);
    }
    public void getMinValue() {
        minValue = scanner.nextInt();
    }
    public void getMaxValue() {
       maxValue = scanner.nextInt();
    }
    public void GameRandomizeNumber() {
        randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
    }
    public void userGuess() {
        userInput = scanner.nextInt();
    }
    public void GameGuessing() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter your guess:");
            userGuess();
            if (userInput < minValue || userInput > maxValue) {
                System.out.println("Your guess is out of range! Please guess within the specified range.");
            }
            if(userInput > randomNumber && userInput <= maxValue) {
                System.out.println("Your guess is too high! Try a lower number.");
            }
            else if(userInput < randomNumber && userInput >= minValue) {
                System.out.println("Your guess is too low! Try a higher number.");
            }
            else if(userInput == randomNumber) {
                System.out.println("You guessed correctly! Congratulations!");
                break;
            }
        }
        System.out.println("You failed!");
    }
}
