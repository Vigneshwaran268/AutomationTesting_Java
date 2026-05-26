package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class MusicPlayList {

    public static void main(String[] args) {

        Set<String> albums = new LinkedHashSet<>();
        albums.add("Ilayaraja Songs");
        albums.add("Ilayaraja Songs");
        albums.add("Anirudh Songs");
        albums.add("Harish Songs");
        albums.add("Yuvan Songs");
        albums.add("Yuvan Songs");
        System.out.println(albums);

    }
}
