package Shop;



import java.util.List;

public class Menu {
    private List<Dish> dish;

    public Menu(List<Dish> dish) {
        this.dish = dish;
    }

    public List<Dish> getDish() {
        return dish;
    }

    @Override
    public String toString() {
        return "Menu{" +
                 dish + "\n" +
                '}';
    }
}
