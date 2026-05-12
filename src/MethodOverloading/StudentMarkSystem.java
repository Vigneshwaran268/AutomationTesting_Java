package MethodOverloading;

public class StudentMarkSystem {

    public void display(int sub_1){
        System.out.println("First Subject Mark: "+sub_1);
    }

    public void display(int sub_2, int sub_3){
        System.out.println("Second Subject Mark: "+sub_2);
        System.out.println("Third Subject Mark: "+sub_3);
    }

    public void display(int sub_3, int sub_4, int sub_5){
        System.out.println("Fourth Subject Mark: "+sub_4);
        System.out.println("Fifth Subject Mark: "+sub_5);
    }

    public static void main(String[] args) {
        StudentMarkSystem obj = new StudentMarkSystem();
        obj.display(56);
        obj.display(87,78);
        obj.display(77,88,99);
    }
}
