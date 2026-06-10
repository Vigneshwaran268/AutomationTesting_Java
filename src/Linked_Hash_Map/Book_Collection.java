package Linked_Hash_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Book_Collection {

    public static void main(String[] args) {

        Map<Integer, String> book = new LinkedHashMap<>();
        book.put(1, "English Book");
        book.put(2, "Tamil Book");
        book.put(3, "Maths Book");
        book.put(4, "Science Book");
        book.put(5, "Social Book");
        System.out.println(book.containsKey(4));
        System.out.println(book.containsValue("Chemistry Book"));
        System.out.println(book.size());

    }
}
