package Shop;

import Shop.dish.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Admin  extends Person {


    public Admin() {
        super("Alex", 20);
    }

    public void createMenu(List<Dish> dish) {
        Menu menu = new Menu(dish);
    }





}

