package LAB05.LAB05_Ex04;
class Race {
    public static void main(String[] args) {
        System.out.println("Provide info for the three competitors:");
        Competitor competitor1 = new Competitor();
        competitor1 = competitor1.assignInfo();

        Competitor competitor2 = new Competitor();
        competitor2 = competitor2.assignInfo();

        Competitor competitor3 = new Competitor();
        competitor3 = competitor3.assignInfo();

        System.out.println("Info for the first competitor:");
        competitor1.showInfo();
        System.out.println("Info for the second competitor:");
        competitor2.showInfo();
        System.out.println("Info for the third competitor:");
        competitor3.showInfo();

        while (true) {
            competitor1.run();
            competitor2.run();
            competitor3.run();

            if (competitor1.getDistanceRan() >= 50) {
                System.out.println("The winner is: " + competitor1.getName());
                break;
            } else if (competitor2.getDistanceRan() >= 50) {
                System.out.println("The winner is: " + competitor2.getName());
                break;
            } else if (competitor3.getDistanceRan() >= 50) {
                System.out.println("The winner is: " + competitor3.getName());
                break;
            }
        }
    }
}

