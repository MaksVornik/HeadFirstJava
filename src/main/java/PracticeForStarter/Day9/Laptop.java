package PracticeForStarter.Day9;

public class Laptop extends Computer {
    private int batteryCapecity;

    public Laptop(String manufarcturer, int productionYear, int batteryCapecity) {
        super(manufarcturer, productionYear);
        this.batteryCapecity = batteryCapecity;
    }
}
