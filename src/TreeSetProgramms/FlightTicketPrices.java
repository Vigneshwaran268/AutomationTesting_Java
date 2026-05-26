package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FlightTicketPrices {

    public static void main(String[] args) {

        Set<Integer> price = new TreeSet<>(Arrays.asList(7000, 5000,5000, 3000));
        System.out.println(price);
    }
}
