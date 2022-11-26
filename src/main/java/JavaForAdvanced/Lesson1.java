package JavaForAdvanced;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list.remove(3);

        System.out.println(list);
        list = new LinkedList<>();

    }

}
