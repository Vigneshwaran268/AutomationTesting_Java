package Encapsulation;

public class CollegeStudent {

    private String studentName;
    private String studentCourse;
    private int studentAge;

    public void setter(String name, String course, int age){
        studentName = name;
        studentCourse = course;
        if(age >= 18){
            studentAge = age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }

    public String getName(){
        return studentName;
    }

    public String getCourse(){
        return studentCourse;
    }

    public int getAge(){
        return studentAge;
    }
}

class MainClass_11{
    public static void main(String[] args) {
        CollegeStudent obj = new CollegeStudent();
        obj.setter("Vignesh","CSE", 19);
        System.out.println("Student Name: "+obj.getName());
        System.out.println("Student Course: "+obj.getCourse());
        System.out.println("Student Age: "+obj.getAge());
    }
}
