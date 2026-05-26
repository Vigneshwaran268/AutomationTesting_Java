package TreeSetProgramms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StockPrices {

    public static void main(String[] args) {

        Set<Integer> price = new TreeSet<>(Arrays.asList(500,500,100,200,50));
        System.out.println(price);

    }
}
