package PracticeForStarter.Day5.Part2;

public class MotobikeTestDrive {
    public static void main(String[] args) {
        Motobike motobike = new Motobike(2011, "Красный", "Porshe");
        System.out.println(motobike.getYear());
        System.out.println(motobike.getColor());
        System.out.println(motobike.getModel());
    }
}
