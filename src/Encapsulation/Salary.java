package Encapsulation;

public class Salary {

    private double salary;

    public void setter(double sal) {
        if (sal > 0) {
            salary = sal;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public double getSalary() {
        return salary;
    }
}

class MainClass_15{
    public static void main(String[] args) {
        Salary obj = new Salary();
        obj.setter(90000);
        System.out.println("Salary: "+obj.getSalary());
    }
}
