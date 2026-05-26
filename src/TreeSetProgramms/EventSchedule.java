package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class EventSchedule {

    public static void main(String[] args) {

        Set<String> timings = new TreeSet<>(Arrays.asList("11.30 AM", "10.30 AM", "11.00 AM", "10.00 AM"));
        System.out.println(timings);
    }
}
