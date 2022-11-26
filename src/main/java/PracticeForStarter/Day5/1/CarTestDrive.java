package Day5;

public class CarTestDrive {
    public static void main(String[] args) {
        Day5.Car car = new Day5.Car();
        car.setYear(2018);
        car.setColor("Зеленый");
        car.setModel("Порш");
        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }

}
