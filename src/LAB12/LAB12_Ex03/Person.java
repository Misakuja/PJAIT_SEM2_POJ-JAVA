package LAB12.LAB12_Ex03;

class Person implements Comparable<Person> {
    String name;
    String surname;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s}", name, surname);
    }

    @Override
    public int compareTo(Person o) {
        return o.surname.compareTo(this.surname);
    }
}
