package PracticeForStarter.Day17;

public enum Season {
    SUMMER(30), WINTER(-2), AUTOMN(10), SPRING(20);
    private int temperature;
    Season (int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "temperature=" + temperature +
                '}';
    }
}
