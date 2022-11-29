package Shop;

import java.util.List;

public class Order {
    private int id;
    private int adminId;
     private int clientId;


    private List<Dish> dishes1;

    public Order(int id, int adminId, int clientId, List<Dish> dish) {
        this.id = id;
        this.adminId = adminId;
        this.clientId = clientId;
        this.dishes1 = dish;

    }

    public int getClientId() {
        return clientId;
    }

    public List<Dish> getDishes1() {
        return dishes1;
    }

    public int getId() {
        return id;
    }

    public int getAdminId() {
        return adminId;
    }
}
