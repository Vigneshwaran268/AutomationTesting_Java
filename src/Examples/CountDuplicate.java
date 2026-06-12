package Examples;

import java.util.*;

public class CountDuplicate {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>(Arrays.asList("java", "python", "java", "c", "c", "python", "java", "c"));

        Set<String> lang = new HashSet<>();
        int duplicateCount = 0;

        for (String element : languages) {
            if (!lang.add(element)) {
                duplicateCount++;
            }
        }
        System.out.println(duplicateCount);
    }

    }

