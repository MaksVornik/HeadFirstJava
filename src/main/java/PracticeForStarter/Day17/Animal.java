package PracticeForStarter.Day17;

public enum Animal {
    DOG("собака"), CAT("кот"), FROG("лягушка");

    private String transaltion;

    private Animal (String translation) {
        this.transaltion = translation;
    }

    public String getTransaltion() {
        return transaltion;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "transaltion='" + transaltion + '\'' +
                '}';
    }
}
