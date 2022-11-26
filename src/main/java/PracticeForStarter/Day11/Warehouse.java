package PracticeForStarter.Day11;

public class Warehouse {
    protected int countOrder = 0;
    private int balance = 0;

    public  int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return countOrder + " " + balance;
    }


}
