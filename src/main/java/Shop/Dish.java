package Shop;

import java.util.List;

public class Dish {
    private final String title;
    private final int price;
    private final List<Integer> id;


    public Dish(String title, int price, List<Integer> id) {
        this.title = title;
        this.price = price;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public List<Integer> getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                 title + '\'' +
                ", Цена=" + price +

                '}' + "\n";
    }
}
