package TreeSetProgramms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CricketScores {

    public static void main(String[] args) {

        Set<Integer> scores = new TreeSet<>(Arrays.asList(200,190,180,200,210));
        System.out.println(scores);
    }
}
