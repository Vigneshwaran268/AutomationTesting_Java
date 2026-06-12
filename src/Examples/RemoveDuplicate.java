package Examples;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<String> bikeBrand = new ArrayList<>(Arrays.asList("Honda", "Yamaha", "Hero", "Hero", "Yamaha", "Bajaj", "Honda"));
        Set<String> s = new TreeSet<>(bikeBrand);
        for (String str: s){
            System.out.println(str);
        }

    }
}
