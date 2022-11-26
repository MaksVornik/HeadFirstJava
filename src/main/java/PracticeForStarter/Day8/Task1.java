package PracticeForStarter.Day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int a = 0;
        while (a <= 2000) {
            stringBuilder.append(a + " ");
            a++;
        }
        System.out.println(stringBuilder.toString());
    }
}

