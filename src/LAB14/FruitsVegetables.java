package LAB14;

class FruitsVegetables extends Products {

    FruitsVegetables(String productName, double productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
    }

    @Override
    protected double calcPrice() {
        return productPrice * 1.03;
    }

    @Override
    public int compareTo(Products o) {
        if (o instanceof FruitsVegetables) {
            return Double.compare(this.productPrice, o.productPrice);
        }
        return 0;
    }
}
