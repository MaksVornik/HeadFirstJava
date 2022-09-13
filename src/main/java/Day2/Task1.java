package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a <=4 && a > 0) {
            System.out.println("Малоэтажний дом");
        }
        if (a <=8 && a >=5) {
            System.out.println("Среднеэтажний дом");
        }
        if (a >= 9) {
            System.out.println("Многоэтажний дом");
        }
        if (a <= 0) {
            System.out.println("Ошибка ввода! Число отрицательное");
        }



    }
}
