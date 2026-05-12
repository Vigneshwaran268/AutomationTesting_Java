package MethodOverRiding_1;

public class PartTimeEmployees extends Employee{

    @Override
    public void calculateSalary() {
        System.out.println("Part time employees salary is 12000");
    }
}
