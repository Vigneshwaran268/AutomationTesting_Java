package MethodOverRiding_1;

public class Main_EmployeeSalarySystem {

    public static void main(String[] args) {
        Employee obj;
        obj = new FullTimeEmployees();
        obj.calculateSalary();

        obj = new PartTimeEmployees();
        obj.calculateSalary();

        obj = new ContractEmployees();
        obj.calculateSalary();
    }
}
