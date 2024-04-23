package LAB01;

class LAB01_Ex03 {
    public static void main(String[] args) {
        double changingNum = 1.609;
        int miles = 1;

        for(int i = 1; i <= 10; ++i) {
            System.out.println(miles * i + "\t" + changingNum * (double)i);
        }

    }
}
