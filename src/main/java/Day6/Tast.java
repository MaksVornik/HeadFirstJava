package Day6;

public class Tast {
    public static void main(String[] args) {
        Car car = new Car(2015);
        Motobike motobike = new Motobike(2015);
        System.out.println(car.yearDifference(1999));
        System.out.println(motobike.yearDifference(2020));

    }
}
