package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Employee_Management_System {

    public static void main(String[] args) {

        Map<Integer, String> employee = new HashMap<>();
        employee.put(101, "Ram");
        employee.put(102, "Sam");
        employee.put(103, "Ragu");
        employee.put(104, "Guna");
        employee.put(105, "Vikki");


        System.out.println(employee.get(103));
        employee.remove(105);
        System.out.println(employee);

        employee.put(102, "Shyam");
        System.out.println(employee);

    }
}
