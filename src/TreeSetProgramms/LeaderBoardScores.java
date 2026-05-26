package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoardScores {

    public static void main(String[] args) {

        Set<Integer> scores = new TreeSet<>(Arrays.asList(400,300,200,100,300,200,400,50));
        System.out.println(scores);

    }
}
