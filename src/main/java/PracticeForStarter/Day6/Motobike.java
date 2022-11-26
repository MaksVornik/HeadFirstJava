package PracticeForStarter.Day6;

public class Motobike {
    private int year;
    private String color;
    private String model;

    public int yearDifference (int year) {
        return Math.abs(this.year - year);
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public Motobike(int year) {
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
