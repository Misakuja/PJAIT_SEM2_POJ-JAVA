package LAB02;
import java.util.Scanner;
class LAB02_Ex03 {
    public static void main(String[] args) {
        System.out.println("Provide time in 24-hours format. Please use the HH:mm format.");
        Scanner scan = new Scanner(System.in);
        String input24h = scan.next();

        String[] input24hSplit = input24h.split(":");

        int hour = Integer.parseInt(input24hSplit[0]);
        int minutes = Integer.parseInt(input24hSplit[1]);

        String AMPMString = "AM";
        if(hour > 12) {
            AMPMString = "PM";
            hour = hour % 12;
        } else if (hour == 12) {
            AMPMString = "PM";
        } else if (hour == 0) {
            hour += 12;
        }
        System.out.println("Same time in 12-hours format:\n" + hour + ":" + minutes + AMPMString);
    }
}
