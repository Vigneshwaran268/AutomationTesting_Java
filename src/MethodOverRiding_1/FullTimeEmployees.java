package MethodOverRiding_1;

public class FullTimeEmployees extends Employee{

    @Override
    public void calculateSalary() {
        System.out.println("Full time employee salary is 20000");
    }
}
