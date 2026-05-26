package HashSetProgramms;

import java.util.HashSet;
import java.util.Set;

public class StudentRollNo {

    public static void main(String[] args) {

        Set<Integer> rollNo = new HashSet<>();
        rollNo.add(101);
        rollNo.add(102);
        rollNo.add(101);
        System.out.println(rollNo);

    }
}
