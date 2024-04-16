package LAB06.LAB06_Ex04;

public enum TicketLength {
    SINGLE(1.0),
    HOURLY(1.5),
    DAILY(4.5);

    private final double timeFactor;

    TicketLength(double timeFactor) {
        this.timeFactor = timeFactor;
    }

    public double getTimeFactor() {
        return timeFactor;
    }
}
