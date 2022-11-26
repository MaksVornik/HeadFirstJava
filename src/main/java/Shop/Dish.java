package Shop;

import java.util.List;

public class Dish {
    private final String title;
    private final int price;
    private final List<String> category;


    public Dish(String title, int price, List<String> category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", ingredients=" + category +
                '}' + "\n";
    }
}
