package PracticeForStarter.Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentValue = 0;
        while (currentValue < 5) {
            double one = sc.nextDouble();
            double two = sc.nextDouble();
            currentValue++;
            if (two == 0) {
                System.out.println("Деление на 0 ");
                continue;
            }
            System.out.println(one / two);

        }
    }
}
