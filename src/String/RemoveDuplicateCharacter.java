package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {

        String str = "Programming";
        char[] c = str.toCharArray();

        Set<Character> s = new LinkedHashSet<>();

        for(Character ch: c){
            s.add(ch);



        }
        System.out.println(s);
    }
}
