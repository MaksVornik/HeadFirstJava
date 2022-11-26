package Shop;

import Shop.dish.*;


import java.util.ArrayList;
import java.util.List;

public class Admin {
    public Menu CreateMenu() {
        Americano americano = new Americano();
        ClassicCoffee classicCoffee = new ClassicCoffee();
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk();
        BountyRoll bountyRoll = new BountyRoll();
        CaesarSalad caesarSalad = new CaesarSalad();
        Cake cake = new Cake();
        Cheesecake cheesecake = new Cheesecake();
        KharchoSoup kharchoSoup = new KharchoSoup();
        PeaSoup peaSoup = new PeaSoup();
        RainbowSalad rainbowSalad = new RainbowSalad();
        RoyalSalad royalSalad = new RoyalSalad();
        RussianSalad russianSalad = new RussianSalad();
        Solyanka solyanka = new Solyanka();

        List<Dish> dishes = new ArrayList<>();

        dishes.add(americano);
        dishes.add(classicCoffee);
        dishes.add(coffeeWithMilk);
        dishes.add(bountyRoll);
        dishes.add(caesarSalad);
        dishes.add(cake);
        dishes.add(cheesecake);
        dishes.add(kharchoSoup);
        dishes.add(peaSoup);
        dishes.add(rainbowSalad);
        dishes.add(royalSalad);
        dishes.add(russianSalad);
        dishes.add(solyanka);

        Menu menu = new Menu(dishes);
        return menu;
    }
    public void printMenu () {

    }

    public Admin() {

    }
}
