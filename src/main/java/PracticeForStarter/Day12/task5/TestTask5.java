package PracticeForStarter.Day12.task5;

import java.util.ArrayList;
import java.util.List;

import static PracticeForStarter.Day12.task5.MusicBand.transfermembers;

public class TestTask5 {
    public static void main(String[] args) {
        List<MusicArtist> a = new ArrayList<>();
        MusicArtist one = new MusicArtist("Max", 16);
        MusicArtist two = new MusicArtist("Nikita", 12);
        MusicArtist three = new MusicArtist("Hary", 18);
        a.add(one);
        a.add(two);
        a.add(three);
        MusicBand band1 = new MusicBand("Mamini businessmans",2022, a);

        List<MusicArtist> b = new ArrayList<>();
        MusicArtist four = new MusicArtist("Andrey", 11);
        MusicArtist five = new MusicArtist("Dima", 12);
        MusicArtist six = new MusicArtist("Oliy", 16);
        b.add(four);
        b.add(five);
        b.add(six);
        MusicBand band2 = new MusicBand("Java",2022, b);
        band1.printmembers();
        band2.printmembers();
        transfermembers(band1,band2);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        band1.printmembers();
        band2.printmembers();


    }

}
