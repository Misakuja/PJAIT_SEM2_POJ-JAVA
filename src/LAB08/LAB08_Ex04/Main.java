package LAB08.LAB08_Ex04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the name and surname.");
            String unsplit = scanner.nextLine();

            String[] nameSurnameArray = new String[2];
            if (unsplit.contains(" ")) {
                nameSurnameArray = unsplit.split(" ");
            } else {
                nameSurnameArray[0] = null;
                nameSurnameArray[1] = null;
            }
            System.out.println("Enter the year of birth.");
            String yearOfBirth = scanner.nextLine();

            Person person = new Person(nameSurnameArray[0], nameSurnameArray[1], yearOfBirth);
            if (person.name != null && person.surname != null && person.yearOfBirth != null) {
                System.out.println(person);
                System.exit(1);
            }
        }
    }
}