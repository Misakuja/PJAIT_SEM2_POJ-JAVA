package LAB05.LAB05_Ex05;

import java.util.Scanner;

public class Fraction {
    private int denominator;
    private int numerator;
    Scanner scanner = new Scanner(System.in);

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction assignInfo() {
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

    public static void alterFractions(Fraction result) {
        while (result.numerator % 2 == 0 && result.denominator % 2 == 0) {
            result.numerator /= 2;
            result.denominator /= 2;
        }
        while (result.numerator % 3 == 0 && result.denominator % 3 == 0) {
            result.numerator /= 3;
            result.denominator /= 3;
        }
    }

    public static void addition(Fraction fraction1, Fraction fraction2, Fraction result) {
        if (fraction1.denominator != fraction2.denominator) {
            fraction1.numerator *= fraction2.denominator;
            fraction1.denominator *= fraction2.denominator;

            fraction2.numerator *= fraction1.denominator;
            fraction2.denominator *= fraction1.denominator;
        }
        result.numerator = fraction1.numerator + fraction2.numerator;
        result.denominator = fraction1.denominator;
    }

    public static void substitution(Fraction fraction1, Fraction fraction2, Fraction result) {
        if (fraction1.denominator != fraction2.denominator) {
            fraction1.numerator *= fraction2.denominator;
            fraction1.denominator *= fraction2.denominator;
            fraction2.numerator *= fraction1.denominator;
            fraction2.denominator *= fraction1.denominator;
        }
        result.numerator = fraction1.numerator - fraction2.numerator;
        result.denominator = fraction1.denominator;
    }

    public static void multiplication(Fraction fraction1, Fraction fraction2, Fraction result) {
        result.numerator = fraction1.numerator * fraction2.numerator;
        result.denominator = fraction1.denominator * fraction2.denominator;
    }

    public static void division(Fraction fraction1, Fraction fraction2, Fraction result) {
        result.numerator = fraction1.numerator * fraction2.denominator;
        result.denominator = fraction1.denominator * fraction2.numerator;
    }
}
