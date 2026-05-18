package Encapsulation;

public class Example_2 {

    private String Student_Name;
    private int Student_Mark;

    public void setter(String name, int mark){
        Student_Name = name;
        Student_Mark = mark;
    }

    public String getName(){
        return Student_Name;
    }

    public int getMark(){
        return Student_Mark;
    }

}

class MainClass{
    public static void main(String[] args) {
        Example_2 obj = new Example_2();
        obj.setter("Sri", 99);
        System.out.println("Student Name: "+obj.getName());
        System.out.println("Student Mark: "+obj.getMark());
    }
}
