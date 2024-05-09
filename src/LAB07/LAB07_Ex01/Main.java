package LAB07.LAB07_Ex01;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Dog's name.");
        String nameDog = scanner.nextLine();
        System.out.println("Enter Cat's colour.");
        String colourDog = scanner.nextLine();

        System.out.println("Enter Cat's name.");
        String nameCat = scanner.nextLine();
        System.out.println("Enter Cat's colour.");
        String colourCat = scanner.nextLine();

        Dog dog = new Dog(nameDog, colourDog);
        Cat cat = new Cat(nameCat, colourCat);

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
    }
