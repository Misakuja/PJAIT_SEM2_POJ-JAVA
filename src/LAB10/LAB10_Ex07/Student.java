package LAB10.LAB10_Ex07;

import java.util.regex.*;

class Student implements Comparable<Student> {
    String name;
    String surname;
    String index;

    Student(String name, String surname, String index) {
        if(!validateNameSurname(name)) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;

        if(!validateNameSurname(surname)) {
            throw new IllegalArgumentException("Invalid surname");
        }
        this.surname = surname;

        if(!validateIndex(index)) {
            throw new IllegalArgumentException("Invalid index");
        }
        this.index = index;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return (this.index).compareTo((otherStudent.index));
    }

    private boolean validateIndex(String index) {
        return Pattern.matches("^s\\d{5}$", index);
    }

    private boolean validateNameSurname(String nameSurname) {
        return Pattern.matches("[a-zA-Z]+", nameSurname);
    }
}