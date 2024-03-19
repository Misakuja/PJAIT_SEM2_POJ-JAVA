package LAB03;

import java.util.Scanner;

public class LAB03_Ex06 {
    public static void main(String[] args) {
        System.out.println("Input the array size");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array;

        array = fillArray(arraySize);
        checkIfDividable(array, arraySize);
    }
    public static int[] fillArray(int arraySize) {
        int[] array = new int[arraySize];
        int max = 1;
        int min = 10;
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }
        return array;
    }
    public static void checkIfDividable(int[] array, int arraySize) {
        int arrayElementsSum = 0;
        for (int i = 0; i < arraySize; i++) {
            arrayElementsSum += array[i];
        }
        if (arrayElementsSum % 5 == 0) {
            System.out.println("true");
        } else System.out.println("false");

    }
}
