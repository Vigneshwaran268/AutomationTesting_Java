package Constructor;

public class Student {

    String name;
    String department;
    char grade;


    Student(String name, String department, char grade){
        this.name = name;
        this.department = department;
        this.grade = grade;

    }

    public static void main(String[] args) {
        Student obj = new Student("Vikki", "CSE", 'A');
        Student obj1 = new Student("Vignesh", "ECE", 'B');
        Student obj2 = new Student("Raj", "IT", 'C');
        Student obj3 = new Student("Sam", "Bio-Medical", 'D');
        Student obj4 = new Student("Ram", "Mech", 'O');

        System.out.println("=====================================================================");
        System.out.println("Name\t\t\tDepartment\t\t\tGrade");
        System.out.println("=====================================================================");

        System.out.println(obj.name+"\t\t\t"+obj.department+"\t\t\t"+obj.grade);
        System.out.println(obj1.name+"\t\t\t"+obj1.department+"\t\t\t"+obj1.grade);
        System.out.println(obj2.name+"\t\t\t"+obj2.department+"\t\t\t"+obj2.grade);
        System.out.println(obj3.name+"\t\t\t"+obj3.department+"\t\t\t"+obj3.grade);
        System.out.println(obj4.name+"\t\t\t"+obj4.department+"\t\t\t"+obj4.grade);

    }
}
