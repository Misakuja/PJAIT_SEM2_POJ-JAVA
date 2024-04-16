package LAB06.LAB06_Ex04;

public class Calculator {
    private final double basePrice;

    public Calculator() {
        this.basePrice = 4.8;
    }
    public void calcPrice(FareReduction fareReduction, TicketLength ticketLength) {

        double finalPrice = basePrice * fareReduction.getReductionFactor() * ticketLength.getTimeFactor();

        String formattedPrice = String.format("%.2f", finalPrice);

        System.out.println("Price: " + formattedPrice + " PLN");
    }
}
