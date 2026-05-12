package Constructor;

public class Employee {

    String name;
    int salary;
    String role;
    static String cname;
    static String clocation;


    Employee(String name, int salary, String role, String cname, String clocation){
        this.name = name;
        this.salary = salary;
        this.role = role;
        Employee.cname = cname;
        Employee.clocation = clocation;


    }

    public static void main(String[] args) {
        Employee.cname ="Tata Elxsi";
        Employee.clocation = "Trivandrum";

        Employee obj = new Employee("Vikki", 30000, "Engineer",Employee.cname, Employee.clocation);
        Employee obj1 = new Employee("Vignesh", 20000, "Engineer",Employee.cname, Employee.clocation);
        Employee obj2 = new Employee("Anjana", 50000, "Lead",Employee.cname, Employee.clocation);
        Employee obj3 = new Employee("Dinoy", 40000, "Senior Engineer",Employee.cname, Employee.clocation);

        System.out.println("========================================================================");
        System.out.println("Name\t\t\tSalary\t\t\tRole\t\t\tCname\t\t\tClocation");
        System.out.println("========================================================================");
        System.out.println(obj.name+"\t\t\t"+obj.salary+"\t\t\t"+obj.role+"\t\t\t"+Employee.cname+"\t\t\t"+Employee.clocation);
        System.out.println(obj1.name+"\t\t\t"+obj1.salary+"\t\t\t"+obj1.role+"\t\t\t"+Employee.cname+"\t\t\t"+Employee.clocation);
        System.out.println(obj2.name+"\t\t\t"+obj2.salary+"\t\t\t"+obj2.role+"\t\t\t"+Employee.cname+"\t\t\t"+Employee.clocation);
        System.out.println(obj3.name+"\t\t\t"+obj3.salary+"\t\t\t"+obj3.role+"\t\t\t"+Employee.cname+"\t\t\t"+Employee.clocation);
    }
}
