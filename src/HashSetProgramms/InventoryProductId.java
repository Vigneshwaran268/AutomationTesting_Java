package HashSetProgramms;

import java.util.HashSet;
import java.util.Set;

public class InventoryProductId {

    public static void main(String[] args) {

        Set<Integer> id = new HashSet<>();
        id.add(7890);
        id.add(6789);
        id.add(7890);
        System.out.println(id);

    }
}
