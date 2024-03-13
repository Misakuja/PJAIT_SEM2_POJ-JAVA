package LAB01;

import java.util.Scanner;
public class LAB01_Ex06 {
    static int[] array;
    static int arraySize;
    static int arraySum;
    public static void main(String[] args) {
        System.out.println("Provide the size of the array.");
        Scanner scan = new Scanner(System.in);
        arraySize = scan.nextInt();

        System.out.println("Provide the first element of the array.");
        Scanner scan2 = new Scanner(System.in);
        int firstElement = scan2.nextInt();

        array = new int[arraySize];
        array[0] = firstElement;

        int nextElement;
        if (firstElement % 2 == 0) {
            nextElement = firstElement + 2;
        } else {
            nextElement = firstElement + 1;
        }
        for(int i = 1; i < arraySize; ++i) {
            array[i] = nextElement;
            nextElement += 2;
        }
        System.out.println("Resulting array:");
        for(int i = 0; i < arraySize; ++i) {
            System.out.print(array[i] + " ");
        } System.out.println();
        System.out.print("Min: ");
        LowestValue();
        System.out.print("Max: ");
        HighestValue();
        System.out.print("Sum: ");
        SumOfElements();
        System.out.print("Average: ");
        AverageValue();
        System.out.print("Median: ");
        MedianValue();
    }
    static void LowestValue() {
        System.out.println(array[0]);
    }
    static void HighestValue() {
        System.out.println(array[arraySize - 1]);
    }
    static void SumOfElements() {
        arraySum = 0;

        for(int i = 0; i < arraySize; ++i) {
            arraySum += array[i];
        }
        System.out.println(arraySum);
    }
    static void AverageValue() {
        double avgValue = (double)arraySum / (double)arraySize;
        System.out.println(avgValue);
    }
    static void MedianValue() {
        if (arraySize % 2 == 0) {
            double avgValue = (double)(array[arraySize / 2] + array[arraySize / 2 + 1]) / 2.0;
            System.out.println(avgValue);
        } else {
            System.out.println(array[arraySize / 2]);
        }

    }
}
