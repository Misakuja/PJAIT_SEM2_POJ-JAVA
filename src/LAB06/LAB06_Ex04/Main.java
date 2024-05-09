package LAB06.LAB06_Ex04;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter fare reduction (NORMAL or DISCOUNTED): ");
        String fareReductionInput = scanner.nextLine();
        FareReduction fareReduction = FareReduction.valueOf(fareReductionInput.toUpperCase());

        System.out.println("Enter ticket length (SINGLE, HOURLY, or DAILY): ");
        String ticketLengthInput = scanner.nextLine();
        TicketLength ticketLength = TicketLength.valueOf(ticketLengthInput.toUpperCase());

        calculator.calcPrice(fareReduction, ticketLength);

    }
}
