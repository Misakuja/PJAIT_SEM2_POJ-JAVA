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
                case 1 ->
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " + " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
                case 2 ->
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " - " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
                case 3 ->
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " * " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
                case 4 ->
                        System.out.println(fraction1.numerator + "/" + fraction1.denominator + " / " + fraction2.numerator + "/" + fraction2.denominator + " = " + result.numerator + "/" + result.denominator);
            }
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
