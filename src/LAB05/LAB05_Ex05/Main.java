package LAB05.LAB05_Ex05;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fraction fractionResult = new Fraction();

        System.out.println("Provide info for the first fraction:");
        Fraction fraction1 = new Fraction();
        fraction1 = fraction1.assignInfo();
        System.out.println("Provide info for the second fraction:");
        Fraction fraction2 = new Fraction();
        fraction2 = fraction2.assignInfo();

        do {
            System.out.print("""
                    What would you like to do?:
                    1 - Addition.
                    2 - Substitute.
                    3 - Multiplication.
                    4 - Division.
                    5 - Alter the first fraction.
                    6 - Alter the second fraction.
                    """);
            int inputDecision = scanner.nextInt();
            switch (inputDecision) {
                case 1 ->
                        Fraction.additionSubstitution(fraction1, fraction2, fractionResult, inputDecision);
                case 2 ->
                        Fraction.additionSubstitution(fraction1, fraction2, fractionResult, inputDecision);
                case 3 ->
                        Fraction.multiplicationDivision(fraction1, fraction2, fractionResult, inputDecision);
                case 4 ->
                        Fraction.multiplicationDivision(fraction1, fraction2, fractionResult, inputDecision);
                case 5 ->
                        fraction1 = fraction1.assignInfo();
                case 6 ->
                        fraction2 = fraction2.assignInfo();
                default ->
                        System.out.println("Invalid input");
            }
            Fraction.showResult(fraction1, fraction2, fractionResult, inputDecision);
            System.out.println("Would you like to go back to the menu?\n- Input 1 to go back.\n- Input anything else to quit");
        } while (scanner.nextInt() == 1);
        scanner.close();
    }
}
