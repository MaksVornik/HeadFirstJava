package PracticeForStarter.Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList());
    }
    public static List<String> parseFileToStringList() {
        File file = new File("people.txt");
        List<String> people = new ArrayList<>();


        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String [] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
        catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

}
