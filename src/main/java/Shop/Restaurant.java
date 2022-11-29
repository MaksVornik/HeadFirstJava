package Shop;

import java.util.List;

public class Restaurant {
    private final Admin admin;
    private final Menu menu;

    public Restaurant(Admin admin, Menu menu) {
        this.admin = admin;
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void createOrder(Client client, List<Dish> dishes) {
        Order order = new Order(client, dishes);
    }
    public Check payForOrder(Order order) {
        return new Check(admin,order);
    }
}
