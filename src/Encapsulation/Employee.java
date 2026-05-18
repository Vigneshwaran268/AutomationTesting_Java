package Encapsulation;

public class Employee {

    private int emp_Id;
    private String emp_Name;
    private int emp_Salary;

    public void getter(int id, String name, int Salary){
        emp_Id = id;
        emp_Name = name;
        emp_Salary = Salary;
    }

    public int setId(){
        return emp_Id;
    }
    public String setName(){
        return emp_Name;
    }
    public int setSalary(){
        return emp_Salary;
    }
}

class MainClass_4{
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getter(33333, "Vignesh", 30000);
        System.out.println("Employee Id: "+obj.setId());
        System.out.println("Employee Name: "+obj.setName());
        System.out.println("Employee Salary: "+obj.setSalary());
    }
}
