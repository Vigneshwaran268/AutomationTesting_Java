package List;

import java.util.ArrayList;
import java.util.List;

public class AddNumbers {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        for(int i=100; i<=150; i++){
            l.add(i);
        }
        int sum = 0;
        for(Integer i: l){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
