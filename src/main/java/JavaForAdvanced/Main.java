package JavaForAdvanced;

import java.util.Arrays;

public class Main {
    public static int[] findMultiples(int x, int n) {
        int[] array = new int[x];
        int m = n;
        for (int i = 0; i < array.length; i++) {
            array[i] = m;
            m = m + n;
        }
        return array;
    }

    public static void main(String[] args) {

        System.out.println(findMultiples(2, 2));
    }
}
