package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Country_Capital {

    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("India", "New Delhi");
        names.put("Japan", "Tokyo");
        names.put("France", "Paris");

        System.out.println(names.containsKey("India"));
        System.out.println(names.containsValue("Kerala"));
    }
}
