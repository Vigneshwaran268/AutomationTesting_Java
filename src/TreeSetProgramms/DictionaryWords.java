package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DictionaryWords {

    public static void main(String[] args) {

        Set<String> words = new TreeSet<>(Arrays.asList("Infant","Knife", "Know", "Infant", "Barber"));
        System.out.println(words);
    }
}
