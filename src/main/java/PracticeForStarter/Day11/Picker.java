package PracticeForStarter.Day11;

public class Picker implements Worker {
        Warehouse warehouse;

    private  int salary = 80;
    private int balance;
    public Picker (Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void doWork(){
        balance += salary;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }



    public void bonus() {
        if (warehouse.countOrder == 1500) {
            warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        }
    }

}
