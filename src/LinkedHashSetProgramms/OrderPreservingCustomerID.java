package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderPreservingCustomerID {

    public static void main(String[] args) {

        Set<Integer> id = new LinkedHashSet<>();
        id.add(666);
        id.add(777);
        id.add(777);
        id.add(777);
        id.add(888);
        System.out.println(id);

    }
}
