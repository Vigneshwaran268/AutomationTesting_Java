package Encapsulation;

public class Student {

    private String Student_Name;
    private int Student_RollNo;
    private int Student_Marks;

    public void setter(String name, int rollNo, int marks){
        Student_Name = name;
        Student_RollNo = rollNo;
        Student_Marks = marks;

    }

    public String getName(){
        return Student_Name;
    }

    public int getRollNo(){
        return Student_RollNo;
    }

    public int getMarks(){
        return Student_Marks;
    }
}

class MainClass_3{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setter("Vikki", 31, 90);
        System.out.println("Student Name: "+obj.getName());
        System.out.println("Student RollNo: "+obj.getRollNo());
        System.out.println("Student Marks: "+obj.getMarks());
    }
}
