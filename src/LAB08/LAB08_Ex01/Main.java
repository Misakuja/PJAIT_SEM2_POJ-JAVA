package LAB08.LAB08_Ex01;

class Main {
    public static void main(String[] args) {
        ParseInt object = new ParseInt();

        int a = object.readNumber();
        int b = object.readNumber();

        String operation = object.readOperation();

        double result = switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b != 0) {
                    yield (double) a / b;
                } else {
                    System.out.println("Cannot Divide by zero.");
                    yield 0;
                }
            }
            default -> {
                System.out.println("Invalid Operation");
                yield 0;
            }
        };
            System.out.println("Result: " + result);
    }
}