package LAB01_Additional;
import java.util.Scanner;
public class LAB01_Additional_Ex03 {
    public static void main(String[] args) {
        System.out.println("Provide three numbers for the equation.");
        Scanner scanNum1 = new Scanner(System.in);
        Scanner scanNum2 = new Scanner(System.in);
        Scanner scanNum3 = new Scanner(System.in);
        int scannedNum1 = scanNum1.nextInt();
        int scannedNum2 = scanNum2.nextInt();
        int scannedNum3 = scanNum3.nextInt();

        if (scannedNum1 + scannedNum2 == scannedNum3) {
            System.out.println(scannedNum1 + " + " + scannedNum2 + " = " + scannedNum3);
        } else if (scannedNum2 + scannedNum3 == scannedNum1) {
            System.out.println(scannedNum2 + " + " + scannedNum3 + " = " + scannedNum1);
        } else if (scannedNum1 + scannedNum3 == scannedNum2) {
            System.out.println(scannedNum1 + " + " + scannedNum3 + " = " + scannedNum2);
        } else {
            System.out.println("There's no pair that equals to the third number in the chosen bunch.");
        }
    }
}

