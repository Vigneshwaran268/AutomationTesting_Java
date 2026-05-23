package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMinNumbers {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        for(int i=100; i<=200; i++){
            l.add(i);
        }

        System.out.println("Maximum: "+Collections.max(l));
        System.out.println("Minimum: "+Collections.min(l));
    }
}
