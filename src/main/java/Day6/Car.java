package Day6;

public class Car {
    private int year;
    private String color;
    private String model;
    public Car(int year) {
        this.year = year;

    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference (int year) {
        if (this.year > year) {
            return this.year - year;
        }else {
            return year - this.year;
        }

    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

