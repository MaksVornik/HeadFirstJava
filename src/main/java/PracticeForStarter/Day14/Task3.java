package PracticeForStarter.Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Human> parseFileToObjList() {
        File file = new File("people.txt");
        List<Human> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())  {
                String line = sc.nextLine();
                String[]  people = line.split(" ");
                if (Integer.parseInt(people[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Human h1= new Human(people[0], Integer.parseInt(people[1]));
                list.add(h1);
            }
            return list;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
