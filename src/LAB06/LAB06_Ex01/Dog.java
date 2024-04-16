package LAB06.LAB06_Ex01;

public class Dog {
    public Dog() {
    }

    public static void woof() {
        System.out.println("Woof");
    }

    public static void woof(int woofs) {
        for(int i = 0; i < woofs;i++ ) {
            System.out.println("Woof");
        }
    }
}
