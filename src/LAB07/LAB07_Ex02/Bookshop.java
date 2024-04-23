package LAB07.LAB07_Ex02;

import java.util.Arrays;

class Bookshop extends Shop {
    String[] products = {"Book1", "Book2", "Book3"};

    Bookshop(String address, int size) {
        super(address, size);
    }

    @Override
    protected String getInformation() {
        return "B O O K S H O P\n" + super.getInformation() + "\nProducts: " + Arrays.toString(products);
    }
}
