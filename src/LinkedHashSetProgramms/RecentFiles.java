package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RecentFiles {

    public static void main(String[] args) {

        Set<String> file = new LinkedHashSet<>();
        file.add("Images.png");
        file.add("Images.png");
        file.add("Notes.txt");
        file.add("Project.java");
        System.out.println(file);


    }
}
