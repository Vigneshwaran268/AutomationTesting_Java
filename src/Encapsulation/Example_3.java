package Encapsulation;

public class Example_3 {

    private String empName;
    private int empSalary;

    public void setter(String name, int Salary){
        empName = name;
        empSalary = Salary;
    }

    public String getName(){
        return empName;
    }

    public int getSalary(){
        return empSalary;
    }
}

class MainClass_2{
    public static void main(String[] args) {
        Example_3 obj = new Example_3();
        obj.setter("Vikki", 30000);
        System.out.println("Employee Name: "+obj.getName());
        System.out.println("Employee Salary: "+obj.getSalary());
    }
}
