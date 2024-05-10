package LAB08.LAB08_Ex03;
import java.io.IOException;

public class ThrowIOException {
    protected void Exception() {
        try {
            throw new IOException("IO exception message");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
