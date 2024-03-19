package LAB03;

import java.util.Scanner;

public class LAB03_Ex05 {
    public static void multiplying(int[] array) {
        System.out.println("Array elements multiplied by 3:");
        for(int i = 0; i < 5; i++) {
            System.out.println(array[i] * 3 + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Input the array's values:");
        for(int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
        }
        multiplying(array);
    }
}
