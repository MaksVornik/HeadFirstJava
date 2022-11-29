package Shop;

import java.util.List;

public class Order {
     private Client client;
     private List<Dish> dishes1;

    public Order(Client client, List<Dish> dish) {

        this.client = client;
        this.dishes1 = dish;

    }

    public Client getClientId() {
        return client;
    }

    public List<Dish> getDishes1() {
        return dishes1;
    }


}
