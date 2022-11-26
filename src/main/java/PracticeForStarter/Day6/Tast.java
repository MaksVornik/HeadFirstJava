package PracticeForStarter.Day6;

public class Tast {
    public static void main(String[] args) {
        Plane plane = new Plane("Порш" , 2009, 50, 10000);
            plane.setYear(2015);
            plane.setLength(60);
            plane.fillUp(123);
            plane.fillUp(574);
            plane.info();
    }
}
