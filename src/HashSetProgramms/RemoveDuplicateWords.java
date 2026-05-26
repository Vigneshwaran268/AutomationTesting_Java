package HashSetProgramms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {

    public static void main(String[] args) {

        String str = "Java Automation using Java";

        String[] words = str.split(" ");

        Set<String> unique = new HashSet<>();

        for(String s: words){
            unique.add(s);
        }
        System.out.println(unique);
    }
}
