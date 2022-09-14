package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean an = false;
        while (!an) {
            String city = sc.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                case "Москва ":
                case "Владивосток ":
                case "Ростов ":
                    System.out.println(" - Россия");

                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                case "Рим ":
                case "Милан ":
                case "Турин ":
                    System.out.println(" - Италия");

                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                case "Ливерпуль ":
                case "Манчестер ":
                case "Лондон ":
                    System.out.println(" - Англия");

                    break;
                case "Stop":
                    an = true;
                    break;
                default:
                    System.out.println(" - Неизвестная страна");

                    break;
            }
        }

    }
}
