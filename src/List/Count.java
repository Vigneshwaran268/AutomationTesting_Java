package List;

import java.util.ArrayList;
import java.util.List;

public class Count {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(200);
        l.add(10);
        l.add(10);

        int count = 0;
        int search = 10;

        for(Integer i: l){
            if(i==search){
                count++;
            }

        }
        System.out.println("Count: "+count);

    }
}
