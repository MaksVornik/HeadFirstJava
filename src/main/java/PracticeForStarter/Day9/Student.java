package PracticeForStarter.Day9;

public class Student extends Human {
    private String studyGroup;

    public Student(String name, String studyGroup) {
        super(name);
        this.studyGroup = studyGroup;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    //    Метод printInfo() в классе Студент должен быть переопределен таким
//    образом, чтобы формат выводимого в консоль сообщения был таким:
//            “Этот человек с именем ИМЯ”
//            “Этот студент с именем ИМЯ”
//            (должно выводиться именно две строки - необходимо использовать ключевое слово
//    super)
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);


    }
}