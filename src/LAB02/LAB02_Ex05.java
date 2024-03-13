package LAB02;
import java.util.Scanner;
public class LAB02_Ex05 {
    public static void main(String[] args) {
        int rows = 10;
        int seatsInRow = 8;
        boolean[][] seatArray = new boolean[rows][seatsInRow];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                seatArray[i][j] = Math.random() < 0.5;
            }
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the row you'd like to seat in, from 1 to " + rows + ":");
            int chosenRow = scanner.nextInt() - 1;

            if (chosenRow < 0 || chosenRow >= rows) {
                System.out.println("Invalid row number. Please pick a row within the range of 1 to " + rows + ".");
                continue;
            }
            System.out.println("Choose the seat number you'd like to seat in, from 1 to " + seatsInRow + ":");
            int chosenSeat = scanner.nextInt() - 1;

            if (chosenSeat < 0 || chosenSeat >= seatsInRow) {
                System.out.println("Invalid seat number. Please pick a seat within the range of 1 to " + seatsInRow + ".");
                continue;
            }
            if (seatArray[chosenRow][chosenSeat]) {
                System.out.println("Seat is already taken. Please pick another one.");
            } else {
                seatArray[chosenRow][chosenSeat] = true;
                System.out.println("Seat reserved successfully!");
            }
            System.out.println("Do you want to make another reservation? (Enter 'x' to exit, 'v' to view the seats reservation status or any other key to continue)");
            String choice = scanner.next();
            if (choice.equals("x")) {
                break;
            }
            if (choice.equals("v")) {
                System.out.println("A - Seat available\nT - Seat taken");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < seatsInRow; j++) {
                        if (seatArray[i][j]) {
                            System.out.print("A ");
                        } else System.out.print("T ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

