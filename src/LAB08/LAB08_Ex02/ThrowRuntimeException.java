package LAB08.LAB08_Ex02;

class ThrowRuntimeException {
    protected void Exception() {
        try {
            throw new RuntimeException("Runtime exception message");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
