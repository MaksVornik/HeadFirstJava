package Day7;

public class Plane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println( "Первый самолет длинее " + " на " + (airplane1.getLength()- airplane2.getLength()) );
        }else if (airplane2.getLength() > airplane1.length) {
            System.out.println("Второй самолет длинее" + " на " + (airplane2.getLength() - airplane1.getLength()));
        }
        else {
            System.out.println(" их длина  одинакова ");
        }
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
