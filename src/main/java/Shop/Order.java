package Shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private List<Dish> dish;

    public Client getClient() {
        return client;
    }

    public List<Dish> getDish() {
        return dish;
    }
}
