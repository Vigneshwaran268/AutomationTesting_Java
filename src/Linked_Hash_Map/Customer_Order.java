package Linked_Hash_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Customer_Order {

    public static void main(String[] args) {

        Map<Integer, String> products = new LinkedHashMap<>();
        products.put(1, "Pen");
        products.put(2, "Calculator");
        products.put(3, "Mirror");
        products.put(4, "Choclate");

        System.out.println(products.get(1));
        products.replace(2, "Scientic Calculator");
        System.out.println(products.entrySet());

    }
}
