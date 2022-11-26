package PracticeForStarter.Day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Max", "informatic");
        Teacher teacher = new Teacher("Julia", "Math");
        System.out.println(student.getStudyGroup());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();

    }
}
