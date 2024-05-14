package LAB09.LAB09_Ex03;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringUtils stringUtils = new StringUtils();

        boolean continueLoop = true;
        while (continueLoop) {
            try {
                System.out.println("1. Reverse String");
                System.out.println("2. Caesar Cipher");
                System.out.println("3. Convert to Lowercase");
                System.out.println("4. Convert to Uppercase");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter a string: ");
                        String stringInput1 = scanner.nextLine();
                        System.out.println("Original String: " + stringInput1);
                        System.out.println("Reversed String: " + stringUtils.reverseString(stringInput1));
                        break;
                    case "2":
                        System.out.print("Enter a string: ");
                        String stringInput2 = scanner.nextLine();
                        System.out.print("Enter the offset for the caesar cipher: ");
                        int offset = scanner.nextInt();
                        System.out.println("Original String: " + stringInput2);
                        System.out.println("Caesar Cipher String: " + stringUtils.caesarCipher(stringInput2, offset));
                        break;
                    case "3":
                        System.out.print("Enter a string: ");
                        String stringInput3 = scanner.nextLine();
                        System.out.println("Original String: " + stringInput3);
                        System.out.println("Lowercase String: " + stringUtils.toLowerCase(stringInput3));
                        break;
                    case "4":
                        System.out.print("Enter a string: ");
                        String stringInput4 = scanner.nextLine();
                        System.out.println("Original String: " + stringInput4);
                        System.out.println("Uppercase String: " + stringUtils.toUpperCase(stringInput4));
                        break;
                    case "5":
                        continueLoop = false;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                continueLoop = false;
            }
        }
    }
}
