package LAB06.LAB06_Ex01;

class Dog {
    public Dog() {
    }

    public void woof() {
        System.out.println("Woof");
    }

    public void woof(int woofs) {
        for(int i = 0; i < woofs;i++ ) {
            System.out.println("Woof");
        }
    }
}
