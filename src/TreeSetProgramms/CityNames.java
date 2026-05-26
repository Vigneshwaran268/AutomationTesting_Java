package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CityNames {

    public static void main(String[] args) {

        Set<String> cities = new TreeSet<>(Arrays.asList("Chennai", "Madurai", "Chennai","Arcade"));
        System.out.println(cities);
    }
}
