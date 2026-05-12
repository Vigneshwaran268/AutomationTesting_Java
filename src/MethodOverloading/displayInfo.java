package MethodOverloading;

public class displayInfo {

    public void display(){
        System.out.println("Java");
    }

    public void display(String name){
        System.out.println(name);
    }

    public void display(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        displayInfo obj = new displayInfo();
        obj.display();
        obj.display("Vikki");
        obj.display("Vignesh", 25);
    }
}
