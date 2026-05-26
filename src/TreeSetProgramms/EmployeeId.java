package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeId {

    public static void main(String[] args) {

        Set<Integer> id = new TreeSet<>(Arrays.asList(101,101,302,102,202));
        System.out.println(id);
    }
}
