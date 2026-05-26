package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class ChatHistory {

    public static void main(String[] args) {

        Set<String> chats = new LinkedHashSet<>();
        chats.add("Arun");
        chats.add("Arun");
        chats.add("Ram");
        chats.add("Sam");
        System.out.println(chats);
    }
}
