package PracticeForStarter.Day8;

public class Airplane  {
    private String producer;
    private int year;
    private int length;
    private int weight;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public String toString() {
        return "Изготовитель : " + producer + " Год выпуска : " + year + " Длина : " + length + " Вес : " + weight;
    }
}
