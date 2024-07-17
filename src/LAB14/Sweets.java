package LAB14;

class Sweets extends Products {

    Sweets(String productName, double productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
    }

    @Override
    protected double calcPrice() {
        return productPrice * 1.08;
    }

    @Override
    public int compareTo(Products o) {
        if (o instanceof Sweets) {
            return Double.compare(this.productPrice, o.productPrice);
        }
        return 0;
    }
}
