package LAB01_Additional;
public class LAB01_Additional_Ex05 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int arraySize = (int)Math.floor(Math.random() * (max - min + 1) + min);

        int[] array;
        array = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            min = 0;
            max = 10;
            array[i] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }
        if (array[0] == 10 || array[arraySize - 1] == 10) {
            System.out.println("first element: " + array[0] + "\n" + "last element: " + array[arraySize - 1] + "\nThe array's first, last or both elements are equal to 10!");
        }
        else {
            System.out.print("The first and last elements are not equal to 10.");
        }
    }
}
