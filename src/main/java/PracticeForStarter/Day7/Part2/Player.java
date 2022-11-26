package PracticeForStarter.Day7.Part2;

public class Player {

     private int stamina;
     private final int MAX_STAMINE = 100;
     private final int MIN_STAMINE = 0;
     public static int countPlayers = 0;

     public static int getCountPlayers() {
          return countPlayers;
     }



     public Player(int stamina) {
          this.stamina = stamina;
          countPlayers++;
     }

     public int getStamina() {
          return stamina;
     }
     public void run() {
          this.stamina = this.stamina - 1;
          if (this.stamina == 0) {
               System.out.println("Игроку нужен отдых , он уходит с поля");
          }
     }
     public void info() {
          if (countPlayers < 6) {
               System.out.println("Команда не полна. На поле еще есть " + (6 - countPlayers) + " свободных мест");
          }else if (countPlayers > 6) {
               System.out.println("на поле " + (countPlayers - 6) + " лишних игроков");
          }else {
               System.out.println("На поле нет свободных мест ");
          }
     }
}
