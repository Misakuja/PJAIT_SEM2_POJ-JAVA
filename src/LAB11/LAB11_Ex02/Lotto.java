package LAB11.LAB11_Ex02;

import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

class Lotto {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    static Set<Integer> randomNumbers() {
        Set<Integer> randomList = new HashSet<>();
        while (randomList.size() < 6) {
            int nextNumber = rand.nextInt(50);
            randomList.add(nextNumber);
        }
        return randomList;
    }
    static Set<Integer> userInput() {
        Set<Integer> userInputList = new HashSet<>();

        System.out.println("Provide 6 integer numbers");
        while (userInputList.size() < 6) {
            String nextNumber = scanner.next();

            if (isNumeric(nextNumber)) {
                int nextInt = Integer.parseInt(nextNumber);

                if(!userInputList.contains(nextInt)) {
                    if (nextInt <= 49 && nextInt >= 1) {
                        userInputList.add(nextInt);
                    } else System.out.println("Please enter a number between 1 and 49.");
                } else System.out.println("Do not enter duplicates.");
            } else System.out.println("Provide valid input.");

        }
        return userInputList;
    }
    static List<Integer> correctGuesses(Set<Integer> userInputList, Set<Integer> randomNumbers) {
        List<Integer> correctGuessList = new ArrayList<>();
        List<Integer> randomPlusUser = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        randomPlusUser.addAll(userInputList);
        randomPlusUser.addAll(randomNumbers);

        for (Integer i : randomPlusUser) {
            if (set.contains(i)) correctGuessList.add(i);
            else set.add(i);
        }
        return correctGuessList;
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
