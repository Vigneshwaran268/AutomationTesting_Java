package HashSetProgramms;

import java.util.HashSet;
import java.util.Set;

public class EmailID {

    public static void main(String[] args) {

        Set<String> id = new HashSet<>();
        id.add("a@gmail.com");
        id.add("b@gmail.com");
        id.add("a@gmail.com");
        System.out.println(id);


    }
}
