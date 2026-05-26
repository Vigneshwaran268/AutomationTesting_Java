package HashSetProgramms;

import java.util.HashSet;
import java.util.Set;

public class WebsiteVisitor {

    public static void main(String[] args) {

        Set<String> visitor = new HashSet<>();
        visitor.add("User1");
        visitor.add("User2");
        visitor.add("User1");
        System.out.println(visitor);

    }
}
