package LAB07.LAB07_Ex01;

class Animal {
    protected String name;
    protected String colour;

    Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    protected String makeSound() {
        return "Animal: " + this.name + "\ncolour: " + this.colour;
    }
}