package JavaForAdvanced;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceIterable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        Iterator<Integer> iterator = list.iterator();
        // Before Java 5
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Java 5
        for (int x : list) {
            System.out.println(x);
        }
     }
}
