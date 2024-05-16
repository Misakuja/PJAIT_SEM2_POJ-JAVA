package LAB09.LAB09_Ex01;

class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Cat cat = new Cat();
        Capybara capybara = new Capybara();


        Animal[] objects = {pig, cat, capybara};

        objects[0].makeSound();
        objects[1].makeSound();
        objects[2].makeSound();
    }
}
