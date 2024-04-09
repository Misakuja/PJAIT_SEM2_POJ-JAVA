package LAB05.LAB05_Ex01;
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Enter the minimum value for the random number range:");
        game.getMinValue();
        System.out.println("Enter the maximum value for the random number range:");
        game.getMaxValue();
        game.GameRandomizeNumber();
        game.GameGuessing();
    }
}
