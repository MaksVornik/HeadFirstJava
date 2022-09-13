package Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int  a = console.nextInt();
        int  b = console.nextInt();
        if (a >= b) {
            System.out.println("Error");
        }else {
            for (int i = a ; i < b ; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.println(i + " ");
                }
            }
        }

    }
}
