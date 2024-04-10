package LAB05.LAB05_Ex02;

public class Main {
    static Suit[] suits = Suit.values();
    static Rank[] ranks = Rank.values();
    public static void main(String[] args) {
        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                Card card = new Card(suit, rank);
                System.out.println(card);
            }
        }
    }
}
