package HashSetProgramms;

import java.util.HashSet;
import java.util.Set;

public class IPAddress {
    public static void main(String[] args) {

        Set<String> address = new HashSet<>();
        address.add("192.269.0");
        address.add("192.269.1");
        address.add("192.269.0");
        System.out.println(address);
    }
}
