package LAB04.LAB04_Ex05;
class Main {
    public static void main(String[] args) {
        Windmill windmill = new Windmill();
        Windmill windmill2 = new Windmill((Windmill.Speed.MEDIUM), true, 10.0, "white");
        windmill.changeDataMenu();
    }
}
