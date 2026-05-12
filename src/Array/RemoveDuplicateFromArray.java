package Array;

import java.util.*;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 3, 4, 4, 4, 5};

        Set<Integer> s = new LinkedHashSet<>();

        for (Integer i : arr) {
            s.add(i);
        }
        System.out.println(s);
    }
}