package Shop;

import java.util.List;

public class Dish {
    private final String title;
    private final int price;



    public Dish(String title, int price) {
        this.title = title;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "{" +
                 title + '\'' +
                ", Цена=" + price +

                '}' + "\n";
    }
}
