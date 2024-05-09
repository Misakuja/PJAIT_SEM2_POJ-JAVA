package LAB08.LAB08_Ex01;

import java.util.Scanner;

class ParseInt {
    Scanner scanner = new Scanner(System.in);
    String[] operations = {"+", "-", "/", "*"};


    public int readNumber() {
        System.out.println("Enter the numbers.");
        String line = scanner.nextLine();

        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            return readNumber();
        }
    }

    public String readOperation() {
        System.out.println("""
        Enter the operation.
        + Addition
        - Subtraction
        / Division
        * Multiplication""");
        String operationInput = scanner.nextLine();

        try {
            for (String operation : operations) {
                if (operationInput.equals(operation)) {
                    return operationInput;
                }
            }
            throw new IllegalArgumentException("Invalid operation");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation");
            return readOperation();
        }
    }
}