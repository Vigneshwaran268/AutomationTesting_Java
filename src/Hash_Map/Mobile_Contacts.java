package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Mobile_Contacts {

    public static void main(String[] args) {

        Map<String, Long> details = new HashMap<>();
        details.put("Vikki", 987654321L);
        details.put("Sam", 9876545674L);
        details.put("Ram", 9786756098L);
        details.put("Siva", 9123487907L);

        details.remove("Ram");
        System.out.println(details);
        System.out.println(details.size());
        details.clear();
        System.out.println(details.isEmpty());

    }
}
