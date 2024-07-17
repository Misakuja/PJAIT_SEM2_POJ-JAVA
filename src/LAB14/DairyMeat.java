package LAB14;

class DairyMeat extends Products {

    DairyMeat(String productName, double productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
    }

    @Override
    protected double calcPrice() {
        return productPrice * 1.05;
    }

    @Override
    public int compareTo(Products o) {
        if (o instanceof DairyMeat) {
            return Double.compare(this.productPrice, o.productPrice);
        }
        return 0;
    }
}
