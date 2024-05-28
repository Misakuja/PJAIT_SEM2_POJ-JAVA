package LAB11.LAB11_Ex06;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class NumberSum {
    static Scanner scanner = new Scanner(System.in);

    static Set<Integer> userInput() {
        Set<Integer> userInputSet = new HashSet<>();

        System.out.println("Provide 10 unique integer numbers");
        while (userInputSet.size() < 10) {
            String nextNumber = scanner.next();

            if (isNumeric(nextNumber)) {
                int nextInt = Integer.parseInt(nextNumber);

                if (!userInputSet.contains(nextInt)) {
                    userInputSet.add(nextInt);
                } else System.out.println("Do not enter duplicates.");
            } else System.out.println("Provide valid input.");

        }
        return userInputSet;
    }
    static int Sum(Set<Integer> set) {
        int sum = 0;

        for(Integer integer : set) {
            sum += integer;
        }
        return sum;
    }
        static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}

