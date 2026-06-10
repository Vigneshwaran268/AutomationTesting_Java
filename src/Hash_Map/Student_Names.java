package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Student_Names {

    public static void main(String[] args) {

        Map<Integer, String> details = new HashMap<>();
        details.put(21, "Vikki");
        details.put(22, "Swathy");
        details.put(23, "Harshini");
        details.put(24, "Joel");
        details.put(25, "Maddy");

        System.out.println(details.get(23));
    }
}
