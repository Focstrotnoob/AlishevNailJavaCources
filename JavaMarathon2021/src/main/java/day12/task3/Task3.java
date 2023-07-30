package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Deep purple", 1968);
        MusicBand musicBand2 = new MusicBand("Rolling stones", 1962);
        MusicBand musicBand3 = new MusicBand("Queen", 1970);
        MusicBand musicBand4 = new MusicBand("Kiss", 1973);
        MusicBand musicBand5 = new MusicBand("Green Day", 1987);
        MusicBand musicBand6 = new MusicBand("Subways", 2003);
        MusicBand musicBand7 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand musicBand8 = new MusicBand("Alabama Shakes", 2009);
        MusicBand musicBand9 = new MusicBand("Fratellis", 2005);
        MusicBand musicBand10 = new MusicBand("Razorlight", 2002);

        List<MusicBand> musicBands = new ArrayList<>(List.of(musicBand1,musicBand2,musicBand3,musicBand4,musicBand5,musicBand6,musicBand7,musicBand8,musicBand9,musicBand10));
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(Task3.groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand mb:bands) {
            if (mb.getYear() > 2000){
                result.add(mb);
            }
        }
        return result;
    }
}
