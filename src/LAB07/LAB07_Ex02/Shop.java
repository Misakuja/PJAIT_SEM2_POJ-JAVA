package LAB07.LAB07_Ex02;

class Shop {
    String address;
    int size;

    Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    protected String getInformation() {
        return "Address: " + address + "\nSize: " + size;
    }
}
