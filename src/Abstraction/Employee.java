package Abstraction;

abstract class Employee {

    abstract void Salary();
}

class FullTimeEmployee extends Employee{
    void Salary(){
        System.out.println("Full Time Employee Salary is 50000");
    }
}

class PartTimeEmployee extends Employee{
    void Salary(){
        System.out.println("Part Time Employee Salary is 25000");
    }
}


class MainClass_4{
    public static void main(String[] args) {
        Employee obj;
        obj = new FullTimeEmployee();
        obj.Salary();

        obj = new PartTimeEmployee();
        obj.Salary();
    }
}
