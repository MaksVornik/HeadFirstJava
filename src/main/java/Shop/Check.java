package Shop;

import java.util.List;

public class Check {
    private Client client1;
    private Order order;

    public Client getClient1() {
        return client1;
    }

    public Order getOrder() {
        return order;
    }
    public static int getSum(List<Integer> order) {
        int sum = 0;
        for (int check : order) {
            sum = sum + check;
        }
        return sum;
    }
}
