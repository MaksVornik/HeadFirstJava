package PracticeForStarter.Day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count1 = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        for (int element:array) {
            if (element % 10 == 0) {
                count1++;
            }
        }
        for (int element : array) {
            if (element % 10 == 0) {
                sum += element;
            }
        }


        System.out.println(Arrays.toString(array));
        System.out.println("наибольший элемент массиво " + max);
        System.out.println("наименьший элемент массиво " + min);
        System.out.println("колличество элементов массива, оканчивающихся на 0 : " + count1);
        System.out.println("сумма элементов массива, оканчивающихся на 0 : " + sum);
    }


}
