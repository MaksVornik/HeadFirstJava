package Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Admin admin = new Admin();

        Collections.sort(admin.getDishes(), new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });


        System.out.println(admin.printMenu());


    }
}
