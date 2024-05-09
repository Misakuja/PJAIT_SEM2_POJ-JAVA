package LAB01;

import java.util.Scanner;
class LAB01_Ex05 {
    public static void main(String[] args) {
        System.out.println("Provide the size of the array.");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        String[] array = new String[arraySize];

        int i;
        for(i = 0; i < arraySize; ++i) {
            System.out.println("Provide a symbol for the array.");
            Scanner scan2 = new Scanner(System.in);
            array[i] = scan2.next();
        }

        for(i = 0; i < arraySize; ++i) {
            System.out.println(array[i]);
        }

    }
}
