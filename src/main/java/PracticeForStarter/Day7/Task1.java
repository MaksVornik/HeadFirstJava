package PracticeForStarter.Day7;

public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Porhs",1999 , 60, 30 );
        Airplane airplane1 = new Airplane(80);
        Airplane airplane2 = new Airplane(70);
        Plane.compareAirplanes(airplane1, airplane2);
    }
}
