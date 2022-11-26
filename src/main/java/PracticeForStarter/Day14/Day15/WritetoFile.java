package PracticeForStarter.Day14.Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WritetoFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("src/main/resources/shoes.csv");

        File file2 = new File("test.txt");
        PrintWriter pw = new PrintWriter(file2);
        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");
                if (Integer.parseInt(shoes[2]) == 0) {


                    pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);

                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
