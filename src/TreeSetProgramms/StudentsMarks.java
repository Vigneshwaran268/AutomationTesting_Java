package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StudentsMarks {

    public static void main(String[] args) {

        Set<Integer> mark = new TreeSet<>(Arrays.asList(98,65,65,76,98,99,99,43,43,45));
        System.out.println(mark);
    }
}
