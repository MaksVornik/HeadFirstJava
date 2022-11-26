package Shop;

import java.util.List;

public class Client {
    private int id;
    private Order order;

    public Client(int id, Order order) {
        this.id = id;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }
}
