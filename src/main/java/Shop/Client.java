package Shop;

import java.util.List;

public class Client extends Person{

    private Order order;

    public Client(int id, String name, int age, Order order) {
        super(id, name, age);
        this.order = order;
    }


    public Order getOrder() {
        return order;
    }
}
