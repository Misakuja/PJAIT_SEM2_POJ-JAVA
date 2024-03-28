package LAB04;
import java.util.Scanner;

public class LAB04_Ex01 {
    public static int[] inputArray(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void arrayPrint(int size, int[] firstArray, int[] secondArray) {
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = firstArray[i] + secondArray[i];
        }
        System.out.println("Our summed up array:");
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Provide the size of the first array:");
        Scanner scanner = new Scanner(System.in);
        int arraySize1 = scanner.nextInt();
        int[] firstArray = inputArray(arraySize1);

        System.out.println("Provide the size of the second array:");
        int arraySize2 = scanner.nextInt();
        if(arraySize1 != arraySize2) {
            System.out.println("The array sizes are not equal. Output:\n[ ]");
            System.exit(0);
        }
        int[] secondArray = inputArray(arraySize2);

        arrayPrint(arraySize1, firstArray, secondArray);
    }
}
