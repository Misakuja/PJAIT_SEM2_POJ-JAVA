package LAB07.LAB07_Ex03;

class Main {
    public static void main(String[] args) {

        Car1 car1 = new Car1("colour1", "model1");
        Car1 car2 = new Car1("colour2", "model2");
        Car1 car3 = new Car1("colour3", "model3");

        Car[] cars = {car1, car2, car3};

        for(Car i : cars) {
            System.out.println(i.GetInfo());
        }
    }
}
