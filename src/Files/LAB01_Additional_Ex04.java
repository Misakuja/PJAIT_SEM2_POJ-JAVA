package Files;
import java.util.Scanner;
public class LAB01_Additional_Ex04 {
    public static void main(String[] args) {
        System.out.println("Provide the amount of seconds to convert.");
        Scanner scan = new Scanner(System.in);
        int secondsProvided = scan.nextInt();

        int hours = (secondsProvided / 3600);
        int minutes = (secondsProvided % 3600) / 60;
        int seconds = (minutes % 60);

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
