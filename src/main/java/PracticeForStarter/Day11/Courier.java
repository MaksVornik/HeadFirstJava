package PracticeForStarter.Day11;

public class Courier implements Worker {
    Warehouse warehouse;
    private int salary = 100;
    private int balance;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void doWork() {
        balance += salary;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    public void bonus() {
        if (warehouse.getBalance() == 1000000) {
            salary *= 2;
        }
    }
}
