package HashSetProgramms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUserName {

    public static void main(String[] args) {

        Set<String> userName = new HashSet<>();
        userName.add("Ram");
        userName.add("Ram");
        userName.add("Sam");
        System.out.println(userName);
    }
}
