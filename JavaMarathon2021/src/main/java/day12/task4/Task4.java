package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members =  new ArrayList<>(List.of("Jon Lord", "Ian Paice","Roger Glover"));
        List<String> members2 = new ArrayList<>(List.of("Darryl Jones", "Ronald David", "Keith Richards"));

        MusicBand musicBand1 = new MusicBand("Deep purple", 1968, members);
        MusicBand musicBand2 = new MusicBand("Rolling stones", 1962, members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
