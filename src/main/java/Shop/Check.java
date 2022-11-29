package Shop;

public class Check {
    private  final Admin admin;
    private final Order order;

    public Check(Admin admin, Order order) {
        this.admin = admin;
        this.order = order;
    }


    public Order getOrder() {
        return order;
    }
    public int getSum() {
        int sum = 0;
        for (Dish dishes : this.order.getDishes1()) {
            sum = sum + dishes.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Check{" +
                "admin=" + admin +
                ", order=" + order +
                '}';
    }
}
