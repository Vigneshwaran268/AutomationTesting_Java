package MethodOverRiding_1;

public class ContractEmployees extends Employee{

    @Override
    public void calculateSalary() {
        System.out.println("Contract Employees salary is 10000");
    }
}
