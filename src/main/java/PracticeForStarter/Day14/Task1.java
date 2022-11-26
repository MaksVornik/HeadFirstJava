package PracticeForStarter.Day14;

import sun.management.FileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       File file = new File("test.txt");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        file = new File("teыst.txt");
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            String[] numbersString = line.split(" ");

            int sum = 0;
            for (String number : numbersString) {
                 sum += Integer.parseInt(number);

            }
            System.out.println(Arrays.toString(numbersString));
            System.out.println("Сумма елементов массива " + sum);

            if (numbersString.length != 10) {
                throw new IllegalArgumentException("Неккоректный входной файл");
            }


        } catch (FileNotFoundException e) {
            System.out.println("Exception: файл не найден");
        }





    }
}
