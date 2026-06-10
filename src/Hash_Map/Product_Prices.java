package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Product_Prices {

    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Mobile", 25000);
        product.put("Laptop", 75000);
        product.put("Wallet", 500);
        product.put("Chair", 750);
        product.put("Cable", 200);

        System.out.println(product.get("Laptop"));
        product.remove("Mobile");
        System.out.println(product);
        System.out.println(product.isEmpty());
    }
}
