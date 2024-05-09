package LAB07.LAB07_Ex03;

class Car2 extends Car {
    int car2Special;

    Car2(String colour, String model) {
        super(colour, model);
    }
    @Override
    protected String GetInfo() {
        return "Car2:" + super.GetInfo() +  "\nSpecial Variable: " + car2Special + "\n";
    }
}
