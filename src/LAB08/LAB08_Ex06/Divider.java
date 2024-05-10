package LAB08.LAB08_Ex06;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        try {
            String number = JOptionPane.showInputDialog(null, "Provide a number.");
            checkNumber(number);

            String divider = JOptionPane.showInputDialog(null, "Provide a divider.");
            checkDivider(divider);

            int result = convertToInteger(number) / convertToInteger(divider);
            JOptionPane.showMessageDialog(null, String.format("Division result is: %d", result));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void checkDivider(String divider) throws ArithmeticException {
        if (divider.isEmpty() || divider.equals("0") || isNotNumeric(divider)) {
            throw new ArithmeticException("Wrong Divider Input.");
        }
    }
    private static void checkNumber(String number) throws ArithmeticException {
        if (isNotNumeric(number) || number.isEmpty()) {
            throw new ArithmeticException("Wrong Number Input.");
        }
    }
    private static int convertToInteger(String number) {
        return Integer.parseInt(number);
    }
    private static boolean isNotNumeric(String strNum) {
        if (strNum == null) {
            return true;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }

}
