package LAB14;

abstract class Products implements Comparable<Products> {
    String productName;
    double productPrice;
    int productQuantity;

    public Products(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    protected abstract double calcPrice();

    @Override
    public String toString() {
        return String.format("%s - %.2f EUR each, Quantity: %d", productName, calcPrice(), productQuantity);
    }
}
