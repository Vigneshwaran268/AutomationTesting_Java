package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PatientID {

    public static void main(String[] args) {

        Set<Integer> ID = new TreeSet<>(Arrays.asList(301, 201, 201, 101));
        System.out.println(ID);
    }
}
