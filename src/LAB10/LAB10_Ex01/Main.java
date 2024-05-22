package LAB10.LAB10_Ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/LAB10/LAB10_Ex01/Input");
            Scanner scanner = new Scanner(file);

            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(i % 2 == 0) {
                    System.out.print(line + " ");
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}