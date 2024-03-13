    package LAB02;
    import java.util.Scanner;
    public class LAB02_Ex02 {
        static int[] array;
        static int arraySize;
        public static void main(String[] args) {
            System.out.println("Provide a number for the array size.");
            Scanner scan = new Scanner(System.in);
            arraySize = scan.nextInt();

            array = new int[arraySize];

            randomizingArray();
            showcasingArray();
            reversingArray();
        }
        public static void randomizingArray() {
            for (int i = 0; i < arraySize - 1; i++) {
                int min = 1;
                int max = 10;
                array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
        }
        public static void showcasingArray() {
            System.out.println("The original array:");
            for (int ArrayElement : array) {
                System.out.print(ArrayElement + " ");
            }
        }
        public static void reversingArray() {
            System.out.println("\nReversed array:");
            for (int i = arraySize - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }
