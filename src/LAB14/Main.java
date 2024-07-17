package LAB14;

import java.util.Scanner;

import static java.lang.System.exit;

class Main {
    public static void main(String[] args) {
        Functionality functionality = new Functionality();
        Scanner scanner = new Scanner(System.in);

        functionality.generateInventory();

        while (true) {
            System.out.println("""
                    Choose an option:
                    1 - Showcase store inventory.
                    2 - Add item to cart.
                    3 - Showcase cart.
                    4 - Sort cart - Ascending.
                    5 - Insert Promo Code.
                    6 - Checkout.
                    Input anything else to exit.""");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1 -> functionality.showcaseInventory();
                case 2 -> {
                    System.out.println("Input item you'd like to add from the list below, and then the quantity:");
                    functionality.showcaseInventoryProductNames();
                    String productChoice = scanner.next();
                    int quantity = scanner.nextInt();

                    productChoice = productChoice.toLowerCase();

                    functionality.addToCart(productChoice, quantity);
                    functionality.showcaseCart();
                }
                case 3 -> functionality.showcaseCart();
                case 4 -> {
                    System.out.println("Sorted cart:");
                    functionality.sortCartAscendingPrice();
                }
                case 5 -> {
                    System.out.println("Input promo code.");
                    String promoCode = scanner.next();

                    promoCode = promoCode.toLowerCase();

                    System.out.println("Your discount:" + String.format("%.2f", functionality.applyPromoCode(promoCode)));
                }

                case 6 -> System.out.println("Thank you for shopping. Your total is: " + String.format("%.2f", functionality.calculateTotalCheckout()));

                default -> exit(1);
            }
        }
    }
}