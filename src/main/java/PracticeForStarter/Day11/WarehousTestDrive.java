package PracticeForStarter.Day11;

public class WarehousTestDrive {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        int pickerOrder = 1;
        while (pickerOrder <= 1500) {
            picker.doWork();
            pickerOrder++;
        }
        int courierSalary = 0;
        while (courierSalary < 1000) {
            courier.doWork();
            courierSalary++;
        }
        picker.bonus();
        courier.bonus();
        System.out.println("Балланс скалада : " + warehouse.getBalance());
        System.out.println("Колличество заказов на складе : " + warehouse.getCountOrder());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();
    }
}
