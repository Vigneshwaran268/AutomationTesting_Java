package Examples;

import java.util.*;

public class ElementOccurrence {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>(Arrays.asList("java","python","java","c","c","python","java","c"));

        Set<String> lang = new HashSet<>(languages);

        for(String lang1: lang){
            int count = 0;

            for(String languages1 : languages){
                if(lang1.equals(languages1)){
                    count++;
                }
            }
            System.out.println(lang1+": "+count);
        }

    }
}
