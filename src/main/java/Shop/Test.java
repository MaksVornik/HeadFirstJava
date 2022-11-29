package Shop;

import Shop.dish.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Americano());
        dishes.add(new BountyRoll());
        dishes.add(new CaesarSalad());
        dishes.add(new Cake());
        dishes.add(new ClassicCoffee());
        dishes.add(new CoffeeWithMilk());
        dishes.add(new KharchoSoup());
        dishes.add(new PeaSoup());
        dishes.add(new RainbowSalad());
        dishes.add(new RoyalSalad());
        dishes.add(new RussianSalad());
        dishes.add(new Solyanka());
        Admin admin = new Admin();
        Menu menu = new Menu(dishes);
        Restaurant restaurant = new Restaurant(admin,menu);
        Collections.sort(dishes, new Comparator<Dish>() {
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






    }
}
