package PracticeForStarter.Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        int count = 0;
        while(sc.hasNextInt()) {
            sum += sc.nextInt();
            count++;
        }
        System.out.println(sum/ (double )count);

    }



}
