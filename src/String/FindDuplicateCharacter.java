package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateCharacter {

    public static void main(String[] args) {

        String str = "Programming";
        char[] ch = str.toCharArray();

        Set<Character> s = new LinkedHashSet<>();

        for(Character c: ch){
            if(!s.add(c)){
                System.out.println(c);
            }

        }


    }
}
