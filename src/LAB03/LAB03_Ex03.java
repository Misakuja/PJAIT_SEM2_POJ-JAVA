    package LAB03;

    import java.util.Scanner;

    class LAB03_Ex03 {

        public static int[] input() {
            int[] numbers = new int[2];

            System.out.println("Input the first number for comparison.");
            Scanner scan1 = new Scanner(System.in);
            numbers[0] = scan1.nextInt();

            System.out.println("Input the second number for comparison.");
            Scanner scan2 = new Scanner(System.in);
            numbers[1] = scan2.nextInt();

            return numbers;
        }
        public static void compare(int num1, int num2) {
            if (num1 < num2) System.out.println("1");
            else if (num1 == num2) System.out.println("0");
            else System.out.println("-1");
        }
        public static void main (String[] args) {
            int[] inputNumbers = input();
            compare(inputNumbers[0], inputNumbers[1]);
        }

    }

