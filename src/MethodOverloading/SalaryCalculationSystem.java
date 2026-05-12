package MethodOverloading;

public class SalaryCalculationSystem {

    public void calculateSalary(int salary){
        System.out.println("Salary: "+salary);
    }

    public void calculateSalary(int salary, int bonus){
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
    }

    public void calculateSalary(int salary, int bonus, int overtime){
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Overtime: "+overtime);
    }

    public static void main(String[] args) {
        SalaryCalculationSystem obj = new SalaryCalculationSystem();
        obj.calculateSalary(10000);
        obj.calculateSalary(20000, 2000);
        obj.calculateSalary(30000,3000,1000);
    }
}
