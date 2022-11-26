package PracticeForStarter.Day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members  = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transfermembers(MusicBand a, MusicBand b) {
        for (MusicArtist artist: a.getMembers()) {
            b.getMembers().add(artist);
        }
        a.getMembers().clear();
    }

    public void printmembers() {
        System.out.println(this.members);
    }


}
