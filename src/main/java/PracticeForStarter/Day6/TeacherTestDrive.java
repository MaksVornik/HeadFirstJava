package PracticeForStarter.Day6;

public class TeacherTestDrive {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Егор Антонов", "Алгебра");
        teacher.evaluate(new Student("Maksim"));
    }
}
