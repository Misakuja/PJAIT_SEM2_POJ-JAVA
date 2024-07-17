package LAB14;
import java.util.*;
import java.util.Map.Entry;

class Functionality {
    HashMap<String, Products> shopInventory;
    LinkedHashMap<String, Products> cart;
    private double discount;

    Functionality() {
        shopInventory = new HashMap<>();
        cart = new LinkedHashMap<>();
    }

    double applyPromoCode(String promoCode) {
        if(promoCode.equals("promocode1")) {
            for(Products product : cart.values()) {
                if(product instanceof FruitsVegetables) {
                    this.discount += product.productPrice * 0.2;
                }
            }
        }
        if(promoCode.equals("promocode2")) {
            for(Products product : cart.values()) {
                this.discount += product.productPrice * 0.1;
            }
        }
        return this.discount;
    }


    void sortCartAscendingPrice() {
        List<Map.Entry<String, Products>> sortedList = new ArrayList<>(cart.entrySet());
        sortedList.sort(Comparator.comparingDouble(entry -> entry.getValue().productPrice));

        cart.clear();
        for (Entry<String, Products> entry : sortedList) {
            cart.put(entry.getKey(), entry.getValue());
        }
        showcaseCart();
    }

    void generateInventory() {
        String[] fruitsVegetables = {"apple", "banana", "carrot"};
        String[] dairyMeat = {"milk", "cheese", "sausage", "chicken"};
        String[] sweets = {"chocolate", "bar"};

        Random random = new Random();

        for (String item : fruitsVegetables) {
            int ifAddProduct = random.nextInt(5) + 1;
            if (ifAddProduct > 2) {
                int quantity = random.nextInt(10) + 1;
                double price = random.nextDouble() * 2 + 0.5;
                addProduct(new FruitsVegetables(item, price, quantity));
            }
        }

        for (String item : dairyMeat) {
            int ifAddProduct = random.nextInt(5) + 1;
            if (ifAddProduct > 3) {
                int quantity = random.nextInt(10) + 1;
                double price = random.nextDouble() * 5 + 1;
                addProduct(new DairyMeat(item, price, quantity));
            }
        }
        for (String item : sweets) {
            int ifAddProduct = random.nextInt(5) + 1;
            if (ifAddProduct > 4) {
                int quantity = random.nextInt(10) + 1;
                double price = random.nextDouble() * 3 + 1;
                addProduct(new Sweets(item, price, quantity));
            }
        }
    }

    void addProduct(Products product) {
        shopInventory.put(product.productName, product);
    }

    void showcaseInventory() {
        for (Products product : shopInventory.values()) System.out.println(product);
    }
    void showcaseInventoryProductNames() {
        for (Products product : shopInventory.values()) System.out.println(product.productName);
    }

    void addToCart(String choice, int quantity) {
        Products chosenProduct = shopInventory.get(choice);

        if(chosenProduct != null && chosenProduct.productQuantity >= quantity && quantity > 0) {
            chosenProduct.productQuantity -= quantity;

            if(cart.containsKey(chosenProduct.productName)) {
                Products cartProduct = cart.get(chosenProduct.productName);
                cartProduct.productQuantity += quantity;
            } else {
                if(chosenProduct instanceof DairyMeat) cart.put(chosenProduct.productName, new DairyMeat(chosenProduct.productName, chosenProduct.productPrice, quantity));
                if(chosenProduct instanceof FruitsVegetables) cart.put(chosenProduct.productName, new FruitsVegetables(chosenProduct.productName, chosenProduct.productPrice, quantity));
                if(chosenProduct instanceof Sweets) cart.put(chosenProduct.productName, new Sweets(chosenProduct.productName, chosenProduct.productPrice, quantity));
            }
        }
    }
    void showcaseCart() {
        for (Products product : cart.values()) System.out.println(product);
    }


    double calculateTotalCheckout() {
        double total = 0;
        for(Products product : cart.values()) {
            total += product.productPrice * product.productQuantity;
        }
        cart.clear();
        return total - this.discount;
    }

}

