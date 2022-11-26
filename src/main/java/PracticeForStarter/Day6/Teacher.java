package PracticeForStarter.Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    Random random = new Random();
    public void evaluate (Student student) {
        int rand = random.nextInt(4) + 2;
        String mark = null;
        if (rand == 2) {
            mark = "неудовлетворительно";
        }else if (rand == 3) {
            mark = "удовлетворительно";
        }else if (rand == 4) {
            mark = "хорошо";
        } else if (rand == 5){
            mark = "отлично";
        }


        System.out.println("Преподаватель " + this.name + " оценил студента по имени : " + student.getName() + " , по предмету : " + this.subject + " , на оценку : " + mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
