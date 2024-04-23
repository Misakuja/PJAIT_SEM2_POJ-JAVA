package LAB07.LAB07_Ex01;

class Cat extends Animal {
    Cat(String name, String colour) {
        super(name, colour);
    }

    @Override
    protected String makeSound() {
        return super.makeSound() + "\n meow";
    }
}
