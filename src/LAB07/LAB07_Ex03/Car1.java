package LAB07.LAB07_Ex03;

class Car1 extends Car {
    int car1Special;

    Car1(String colour, String model) {
        super(colour, model);
    }
    @Override
    protected String GetInfo() {
        return "Car1:" + super.GetInfo() +  "\nSpecial Variable: " + car1Special + "\n";
    }
}
