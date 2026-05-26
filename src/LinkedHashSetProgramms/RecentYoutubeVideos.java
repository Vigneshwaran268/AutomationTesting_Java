package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RecentYoutubeVideos {

    public static void main(String[] args) {
        Set<String> video = new LinkedHashSet<>();
        video.add("Java Tutorial");
        video.add("Java Tutorial");
        video.add("Selenium Tutorial");
        video.add("Python Tutorial");
        System.out.println(video);


    }

}
