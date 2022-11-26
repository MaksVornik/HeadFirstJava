package PracticeForStarter.Day14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        List<String> list = parseFileToStringList();
        for (String s: list) {
            String[] split = s.split(" ");
            String name = split[0];
            int age = Integer.parseInt(split[1]);

            if (age < 0)
                throw new IllegalArgumentException("Некорректный входной файл");


        }
        System.out.println(list);
    }

    public static List<String> parseFileToStringList() throws IOException, IOException {
        return Files.readAllLines(new File("people.txt").toPath());
    }

}
