package LinkedHashSetProgramms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RecentProducts {

    public static void main(String[] args) {

        Set<String> products = new LinkedHashSet<>();
        products.add("Mobile");
        products.add("Mobile");
        products.add("Laptop");
        products.add("Mobile Accessories");
        System.out.println(products);

    }
}
