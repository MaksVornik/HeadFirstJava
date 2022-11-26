package PracticeForStarter.Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] > 8) {
                counter1++;
            }
            if (array[i] == 1) {
                counter2++;
            }
            if (array[i] % 2 == 0) {
                counter3++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Information about array : ");
        System.out.println("Длина массива : " + array.length);
        System.out.println("Колличество чисел больше 8 :" + counter1);
        System.out.println("Колличествоово чисел равных 1:" + counter2);
        System.out.println("Колличествоово четных чисел:" + counter3);
        System.out.println("Сумма всех чисел массива:" + sum);

    }
}
