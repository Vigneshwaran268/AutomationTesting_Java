package Practice;

public class Student{

    static String cname = "PSNA College";
    static String caddress = "Dindigul";

    public void display(String name, int id, int marks){

        System.out.println(name);
        System.out.println(id);
        System.out.println(marks);
        System.out.println(cname);
        System.out.println(caddress);

    }

    public static void main(String[] args) {
        Student obj = new Student();

        System.out.println("Student 1 details:");
        obj.display("vikki", 101, 88);

        System.out.println("Student 2 details:");
        obj.display("Vignesh", 102, 80);
    }
}