package PracticeForStarter.Day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        MusicBand musicBand1 = new MusicBand("One", 1980);
        MusicBand musicBand2 = new MusicBand("Two", 2002);
        MusicBand musicBand3 = new MusicBand("Three", 2003);
        MusicBand musicBand4 = new MusicBand("Four", 1780);
        MusicBand musicBand5 = new MusicBand("Five", 2005);
        MusicBand musicBand6 = new MusicBand("Six", 1926);
        MusicBand musicBand7 = new MusicBand("Seven", 2007);
        MusicBand musicBand8 = new MusicBand("Eight", 2008);
        MusicBand musicBand9 = new MusicBand("Night", 1999);
        MusicBand musicBand10 = new MusicBand("Ten", 2010);
        list.add(musicBand1);
        list.add(musicBand2);
        list.add(musicBand3);
        list.add(musicBand4);
        list.add(musicBand5);
        list.add(musicBand6);
        list.add(musicBand7);
        list.add(musicBand8);
        list.add(musicBand9);
        list.add(musicBand10);
        System.out.println(list.toString());
        Collections.shuffle(list);
        System.out.println(list.toString());
        System.out.println("/////////////////////////////////////////////");
        System.out.println("Original list : " + list.toString() );
        System.out.println("2000 years list : " + groupsAfter2000(list) );
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> listBand2 = new ArrayList<>();
        for (MusicBand bandList : bands) {
            if (bandList.getYear() >= 2000) {
                listBand2.add(bandList);
            }
        }
        return listBand2;
    }
}
