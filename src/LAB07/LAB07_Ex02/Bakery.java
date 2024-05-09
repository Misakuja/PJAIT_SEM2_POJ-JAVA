package LAB07.LAB07_Ex02;

import java.util.Arrays;

class Bakery extends Shop {
    String[] products = {"Cookies", "Bread", "Cakes"};

    Bakery(String address, int size) {
        super(address, size);
    }

    @Override
    protected String getInformation() {
        return "B A K E R Y:\n" + super.getInformation() + "\nProducts: " + Arrays.toString(products);
    }
}
