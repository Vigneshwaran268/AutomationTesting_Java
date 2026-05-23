package List;

import java.util.ArrayList;
import java.util.List;

public class Names {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        str.add("Vikki");
        str.add("Ram");
        str.add("Sam");
        str.add("Tom");

        for(int i=str.size()-1; i>=0; i--){
            System.out.println(str.get(i));
        }
    }
}
