package Practice;

public class Employee {

    static String company_name = "Tata Elxsi";
    static String company_address  = "Trivandrum";
    static String block_name = "Neyyar";

    public void display(String name, int id, int salary){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
        System.out.println("Company Name: "+company_name);
        System.out.println("Company Address: "+company_address);
        System.out.println("Block Name: "+block_name);

    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println("Employee 1 details");
        obj.display("Vikki", 101, 25000 );
        System.out.println("Employee 2 details");
        obj.display("Arun", 102, 28000 );
        System.out.println("Employee 3 details");
        obj.display("Bala", 103, 29000 );
        System.out.println("Employee 4 details");
        obj.display("Hari", 104, 20000 );
        System.out.println("Employee 5 details");
        obj.display("Siva", 105, 21000 );
    }


}
