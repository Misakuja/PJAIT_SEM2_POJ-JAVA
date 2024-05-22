package LAB10.LAB10_Ex04;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime now = LocalDateTime.now();

        System.out.print("Provide the format for displaying the date:");
        String dateFormat = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        System.out.print("Formatted date: " + now.format(formatter));
    }
}
