package PracticeForStarter.Day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(30);

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0){
                list.add(i);
            }
            else {
                continue;
            }


        }

        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0){
                list.add(i);
            }
            else {
                continue;
            }


        }
        System.out.println(list);
    }
}
