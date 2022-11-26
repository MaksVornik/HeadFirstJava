package PracticeForStarter.Day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("One");
        a.add("Two");
        a.add("Three");
        a.add("Four");

        MusicBand band1 = new MusicBand("мамины бизнесмены", 2022, a);

        List<String> b = new ArrayList<>();
        b.add("Den");
        b.add("Fen");
        b.add("Run");
        b.add("Dun");
        MusicBand band2 = new MusicBand("мамины бизнесмены", 2022, b);
        band1.printmembers();
        band2.printmembers();
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
        MusicBand.transfermembers(band1,band2);
        band1.printmembers();
        band2.printmembers();


    }
}
