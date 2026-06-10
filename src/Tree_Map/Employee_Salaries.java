package Tree_Map;

import java.util.TreeMap;

public class Employee_Salaries {

    public static void main(String[] args) {

        TreeMap<Integer, Integer> employee = new TreeMap<>();
        employee.put(2,55000);
        employee.put(1,85000);
        employee.put(5,30000);
        employee.put(4,45000);
        employee.put(3,15000);
        System.out.println(employee.firstEntry());
        System.out.println(employee.lastEntry());
        System.out.println(employee.containsKey(5));


    }
}
