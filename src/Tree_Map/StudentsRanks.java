package Tree_Map;

import java.util.Map;
import java.util.TreeMap;

public class StudentsRanks {

    public static void main(String[] args) {

        Map<Integer, String> details = new TreeMap<>();
        details.put(2,"Vikki");
        details.put(1,"Swathy");
        details.put(5,"Kumar");
        details.put(4,"Viswa");
        details.put(3,"Sam");
        System.out.println(details);

    }
}
