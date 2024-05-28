package LAB11.LAB11_Ex06;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Set<Integer> set = NumberSum.userInput();
        System.out.println("Result of summing up all the numbers: " + NumberSum.Sum(set));
    }
}
