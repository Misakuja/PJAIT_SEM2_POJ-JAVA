package LAB01;

import java.util.Scanner;

class LAB01_Ex04 {
    public static void main(String[] args) {
        System.out.println("Provide a number from the range of 1 to 7.");
        Scanner scan = new Scanner(System.in);
        int daysOfTheWeek = scan.nextInt();
        switch (daysOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Provide a valid number.");
        }

    }
}
