package LAB07.LAB07_Ex03;

class Car {
    String colour;
    String model;

    Car(String colour, String model) {
        this.colour = colour;
        this.model = model;
    }
    protected String GetInfo() {
        return "\nColour: " + colour + "\nModel: " + model;
    }
}
