package LAB10.LAB10_Ex07;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students would you like to add?");
        Student[] students = new Student[scanner.nextInt()];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the student's name:");
            String name = scanner.next();
            System.out.println("Enter the student's surname:");
            String surname = scanner.next();
            System.out.println("Enter the student's index:");
            String index = scanner.next();

            students[i] = new Student(name, surname, index);
        }

        Arrays.sort(students);

        System.out.print("""
        Sorted list of students:
        Name | Surname | Index
        """);
        for (Student student : students) {
            System.out.println(student.name + " " + student.surname + " " + student.index);
        }
    }
}
