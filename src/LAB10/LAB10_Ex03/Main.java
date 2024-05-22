package LAB10.LAB10_Ex03;

import java.time.LocalDate;

class Main {
    public static void main(String[] args) {

        LocalDate curDate = LocalDate.now();
        int yearCheck = curDate.getYear();

        System.out.println("The next 100 leap years are:");
        for (int i = 0; i < 100; i++) {
            if(curDate.isLeapYear()) {
                System.out.print(yearCheck + " ");
                yearCheck += 4;
            } else yearCheck++;
        }
    }
}
