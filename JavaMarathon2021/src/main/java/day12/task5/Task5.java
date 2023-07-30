package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members =  new ArrayList<>(List.of(new MusicArtist("Jon Lord", 58), new MusicArtist("Ian Paice", 48), new MusicArtist("Roger Glover", 56)));
        List<MusicArtist> members2 = new ArrayList<>(List.of(new MusicArtist("Darryl Jones", 35), new MusicArtist( "Ronald David",  45), new MusicArtist("Keith Richards", 25)));

        MusicBand musicBand1 = new MusicBand("Deep purple", 1968, members);
        MusicBand musicBand2 = new MusicBand("Rolling stones", 1962, members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
