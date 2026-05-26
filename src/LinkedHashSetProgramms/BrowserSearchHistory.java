package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class BrowserSearchHistory {

    public static void main(String[] args) {

        Set<String> search = new LinkedHashSet<>();
        search.add("Sports News");
        search.add("Sports News");
        search.add("Political News");
        search.add("Current Affair");
        System.out.println(search);
    }
}
