package PracticeForStarter.Day9;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {

        return 3.14 * (Math.pow(radius,2));
    }

    @Override
    public double perimeter() {
        return 2 * radius * 3.14;
    }
}
