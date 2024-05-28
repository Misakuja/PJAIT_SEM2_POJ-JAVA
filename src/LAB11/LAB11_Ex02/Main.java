package LAB11.LAB11_Ex02;

import java.util.Set;
import java.util.List;

class Main {
    public static void main(String[] args) {


        Set<Integer> userInputList = Lotto.userInput();
        Set<Integer> randomNumbersList = Lotto.randomNumbers();

        List<Integer> correctGuesses = Lotto.correctGuesses(userInputList, randomNumbersList);

        System.out.println("Your guesses: " + userInputList);
        System.out.println("Lucky numbers: " + randomNumbersList);
        System.out.println("The correct guesses:: " + correctGuesses);
        System.out.println("Amount of correct guesses:: " + correctGuesses.size());
    }
}
