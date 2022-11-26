package JavaForAdvanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        // [1][2][3][4][5]
        for (int i = 0; i < 2; i++) {
            int a = 6;
            arrayList.add(0,a);
            a++;
        }
        System.out.println(linkedList);


    }
    private static void measureTime(List<Integer> list) {


        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
