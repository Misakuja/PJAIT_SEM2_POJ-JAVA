package LAB01;

import java.util.Scanner;
class LAB01_Ex07 {
    static int a;
    static int b;
    public static void main(String[] args) {
        System.out.println("Provide two integer values.");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        GreatestCommonDivisor();
    }
    static void GreatestCommonDivisor() {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Greatest Common Divisor is: " + a);
    }
}
