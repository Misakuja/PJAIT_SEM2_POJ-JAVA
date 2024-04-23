package LAB07.LAB07_Ex03;

class Car3 extends Car {
    int car3Special;

    Car3(String colour, String model) {
        super(colour, model);
    }
    @Override
    protected String GetInfo() {
        return "Car3:" + super.GetInfo() +  "\nSpecial Variable: " + car3Special + "\n";
    }
}
