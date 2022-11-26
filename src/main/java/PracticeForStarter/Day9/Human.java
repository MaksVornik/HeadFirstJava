package PracticeForStarter.Day9;

public class Human {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем " + name);
    }

}
