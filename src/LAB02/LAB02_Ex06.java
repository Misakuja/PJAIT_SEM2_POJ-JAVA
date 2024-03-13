package LAB02;
import java.util.Scanner;
public class LAB02_Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] array = new int[N + 1];
        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i < N; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println("Fibonacci sequence with " + N + "amount of elements.");
        for(int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

