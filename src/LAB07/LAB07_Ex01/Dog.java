package LAB07.LAB07_Ex01;

class Dog extends Animal {
     Dog(String name, String colour) {
         super(name, colour);
     }

    @Override
    protected String makeSound() {
        return super.makeSound() + "\n woof";
    }
}
