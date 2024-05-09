package LAB01_Additional;
import java.util.Scanner;
class LAB01_Additional_Ex02 {
    public static void main(String[] args) {
        System.out.println("Provide a number to check.");
        Scanner scan = new Scanner(System.in);
        int numberToCheck = scan.nextInt();
        if(numberToCheck % 2 == 0) {
            System.out.println("The given number is even.");
        }
        else {
            System.out.println("The given number is odd.");
        }
    }
}
