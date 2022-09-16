package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array = {1, 12, 12, 15, 166, 18, 1223, 12, 45, 14};
        Random random = new Random();

//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10000);
//        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3 ; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
// [1, 12, 12, 15, 166, 18]