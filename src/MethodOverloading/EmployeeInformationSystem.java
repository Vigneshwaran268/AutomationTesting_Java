package MethodOverloading;

public class EmployeeInformationSystem {

    public void show(int emp_id){
        System.out.println("Employee Id: "+emp_id);
    }

    public void show(String name){
        System.out.println("Employee Name: "+name);
    }

    public void show(int emp_id, String name){
        System.out.println("Employee Id: "+emp_id);
        System.out.println("Employee Name: "+name);
    }

    public static void main(String[] args) {
        EmployeeInformationSystem obj = new EmployeeInformationSystem();
        obj.show(33333);
        obj.show("Vignesh");
        obj.show(33333, "Vignesh");
    }
}
