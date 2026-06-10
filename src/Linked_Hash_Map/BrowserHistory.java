package Linked_Hash_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class BrowserHistory {

    public static void main(String[] args) {

        Map<Integer, String> website  =new LinkedHashMap<>();
        website.put(15, "Facebook");
        website.put(10, "Instagram");
        website.put(20, "Snapchat");
        website.put(5, "Whatsapp");
        System.out.println(website);

        website.remove(15, "Facebook");

        System.out.println(website);




    }
}
