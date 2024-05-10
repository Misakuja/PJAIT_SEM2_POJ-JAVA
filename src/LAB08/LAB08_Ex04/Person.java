package LAB08.LAB08_Ex04;

import java.util.Objects;

class Person {
    String name;
    String surname;
    String yearOfBirth;

    Person(String name, String surname, String yearOfBirth) {
        try {
            checkPersonData(name, surname, yearOfBirth);
            if (!Objects.equals(name, "")) this.name = name;
            if (!Objects.equals(surname, "")) this.surname = surname;
            if (Integer.parseInt(yearOfBirth) > 1900 && Integer.parseInt(yearOfBirth) < 2020) this.yearOfBirth = yearOfBirth;
        } catch (Exception e) {
            System.out.println("Could not create the object. Exception: " + e.getMessage());
        }
    }
    protected void checkPersonData(String name, String surname, String yearOfBirth) throws Exception {
        if (Objects.equals(surname, "") || surname == null) {
            throw new Exception("Surname is empty.");
        }
        else if (Objects.equals(name, "") || name == null) {
            throw new Exception("Name is empty.");
        }
        else if (Integer.parseInt(yearOfBirth) < 1900 || Integer.parseInt(yearOfBirth) > 2020) {
            throw new Exception("Invalid year of birth.");
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + "\nYoB: " + this.yearOfBirth;
    }
}