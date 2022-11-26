package PracticeForStarter.Day6;

public class Plane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Plane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info() {
        System.out.println("Изготовитель : " + producer + " Год выпуска : " + year + " Длина : " + length + " Вес : " + weight + "Кол-во топлива : " + fuel );
    }
    public void fillUp(int fuel) {
        this.fuel = fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
