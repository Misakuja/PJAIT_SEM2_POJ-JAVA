package LAB07.LAB07_Ex02;

public class Main {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop("3982 Capitol Avenue Anderson IN", 6);
        Bakery bakery = new Bakery("4543 Gladwell Street Longview TX", 5);

        System.out.println(bookshop.getInformation());
        System.out.println("\n");
        System.out.println(bakery.getInformation());

    }
}
