package LAB12.LAB12_Ex03;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        System.out.println("How many people would you like to add?");
        int numberOfPeople = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Provide the name and surname, use a space in between.");
            String fullName = scanner.nextLine();
            String[] nextName = fullName.split(" ");

            people.add(new Person(nextName[0], nextName[1]));
        }

        Collections.sort(people);

        System.out.println("\nAfter sorting:");
        for (Person person : people) {
            System.out.println(person);
        }
        scanner.close();
    }
}