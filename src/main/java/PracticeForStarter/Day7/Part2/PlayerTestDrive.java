package PracticeForStarter.Day7.Part2;

public class PlayerTestDrive {
    public static void main(String[] args) {
        int i = 0;
        Player playerOne = new Player(90);
        Player playerTwo = new Player(91);
        Player playerThree = new Player(92);
        Player playerFour = new Player(93);
        Player playerFive = new Player(94);
        Player playerSix = new Player(95);
        Player playerSeven = new Player(95);
        Player playerEight = new Player(95);
        playerOne.info();
        playerOne.run();
        playerOne.run();
        playerOne.run();
        playerOne.run();
        playerOne.run();
        playerOne.run();
        playerOne.run();

        System.out.println("Выносливость игрока : " + playerOne.getStamina());

    }
}
