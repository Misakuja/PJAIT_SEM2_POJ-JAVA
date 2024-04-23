package LAB05.LAB05_Ex05;

import java.util.Scanner;

class Fraction {
    private int denominator;
    private int numerator;
    Scanner scanner = new Scanner(System.in);

    Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    Fraction assignInfo() {
        System.out.println("Provide the numerator for the fraction:");
        numerator = scanner.nextInt();

        while (true) {
            System.out.println("Provide the denominator for the fraction:");
            denominator = scanner.nextInt();
            if (denominator != 0) {
                break;
            }
            System.out.println("You can't divide by 0!");
        }
        return new Fraction(numerator, denominator);
    }

    Fraction() {
    }

    public static void showResult(Fraction fraction1, Fraction fraction2, Fraction result, int inputDecision) {
        if (inputDecision > 0 && inputDecision < 5) {
            switch (inputDecision) {
                case 1 -> {
                    if (result.numerator == result.denominator) {
                        System.out.println(fraction1.numerator);
                    } else
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " + " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
                }
                case 2 -> {
                    if (result.numerator == result.denominator) {
                        System.out.println(fraction1.numerator);
                    } else
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " - " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
                }
                case 3 -> {
                    if (result.numerator == result.denominator) {
                        System.out.println(fraction1.numerator);
                    } else
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " * " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
                }
                case 4 -> {
                    if (result.numerator == result.denominator) {
                        System.out.println(fraction1.numerator);
                    } else
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " / " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
                }
            }
        }
    }

    public static void additionSubstitution(Fraction fraction1, Fraction fraction2, Fraction result, int inputDecision) {
        int fractionDenominator1 = fraction1.denominator;
        int fractionDenominator2 = fraction2.denominator;

        if (fraction1.denominator != fraction2.denominator) {
            fraction1.numerator *= fractionDenominator2;
            fraction1.denominator *= fractionDenominator2;

            fraction2.numerator *= fractionDenominator1;
            fraction2.denominator *= fractionDenominator1;
        }
        if (inputDecision == 1) result.numerator = fraction1.numerator + fraction2.numerator;
        else if (inputDecision == 2) result.numerator = fraction1.numerator - fraction2.numerator;
        result.denominator = fraction1.denominator;

        fraction1.numerator /= fractionDenominator2;
        fraction1.denominator /= fractionDenominator2;

        fraction2.numerator /= fractionDenominator1;
        fraction2.denominator /= fractionDenominator1;

        alterFraction(result);
    }

    public static void multiplicationDivision(Fraction fraction1, Fraction fraction2, Fraction result, int inputDecision) {
        if (inputDecision == 1)
            result.numerator = fraction1.numerator * fraction2.numerator;
        else if (inputDecision == 2)
            result.denominator = fraction1.denominator * fraction2.denominator;
    }

    private static int greatestCommonDivisor(Fraction result) {
        int a = result.numerator;
        int b = result.denominator;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static void alterFraction(Fraction result) {
        int gcd = greatestCommonDivisor(result);
        if (gcd != 0) {
            result.numerator /= gcd;
            result.denominator /= gcd;
        }
    }
}
