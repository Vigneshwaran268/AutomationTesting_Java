package Linked_Hash_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Favorite_Movies {

    public static void main(String[] args) {

        Map<Integer, String> movie = new LinkedHashMap<>();
        movie.put(1, "Theri");
        movie.put(2, "Thupakki");
        movie.put(3, "Kathi");
        movie.put(4, "Bigil");
        movie.put(5, "Mersal");
        System.out.println(movie);

    }
}
