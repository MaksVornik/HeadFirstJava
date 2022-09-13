package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean an = false;
        while (!an) {
            String city = sc.nextLine();
            if (city.equals("Москва") || city.equals("Владивосток") || city.equals("Ростов") || city.equals("Москва ") || city.equals("Владивосток ") || city.equals("Ростов ") ) {
                System.out.println(" - Россия");

            }
            else if (city.equals("Рим") || city.equals("Милан") || city.equals("Турин") || city.equals("Рим ") || city.equals("Милан ") || city.equals("Турин ")) {
                System.out.println(" - Италия");

            }
            else if (city.equals("Ливерпуль") || city.equals("Манчестер") || city.equals("Лондон") || city.equals("Ливерпуль ") || city.equals("Манчестер ") || city.equals("Лондон ")) {
                System.out.println(" - Англия");

            }
            else if (city.equals("Stop")) {
                an = true;
            }
            else {
                System.out.println(" - Неизвестная страна");

            }
        }

    }
}
