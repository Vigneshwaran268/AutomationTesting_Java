package List;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        for(int i=1; i<=10; i++){
            l.add(i);
        }

        l.removeIf(n -> n%2==0);
        System.out.println(l);

    }
}
