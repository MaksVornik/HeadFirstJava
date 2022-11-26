package PracticeForStarter.Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList());

    }
    public static List<Person> parseFileToObjList() {
        File file = new File("people.txt");
        List<Person> people = new ArrayList();
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String line= sc.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Person p1 = new Person(person[0],Integer.parseInt(person[1]));
                people.add(p1);
            }
            return people;
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
        catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
