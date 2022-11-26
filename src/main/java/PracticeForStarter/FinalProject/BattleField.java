package PracticeForStarter.FinalProject;

import java.util.Arrays;

public class BattleField {
    char[][] map1 = new char[10][10];
    {   System.out.println("А Б В Г Д Е Ж З И К");
        for (int i = 0; i < map1.length; i++) {
            for (int j = 0; j < map1[i].length; j++) {
                map1[i][j] = '⬜';
                System.out.print(map1[i][j]);
            }
        }
    }


    public char[][] getMap() {
        return map1;
    }

    public void setMap(char[][] map) {
        this.map1 = map;
    }

    public char[][] getMap1() {
        return map1;
    }

    public void setMap1(char[][] map1) {
        this.map1 = map1;
    }





    @Override
    public String toString() {
        return Arrays.toString(map1) ;
    }

}
