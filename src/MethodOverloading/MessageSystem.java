package MethodOverloading;

public class MessageSystem {

    public void message(){
        System.out.println("Welcome");
    }

    public void message(String name){
        System.out.println(name);
    }

    public void message(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        MessageSystem obj = new MessageSystem();
        obj.message();
        obj.message("Vikki");
        obj.message("Vignesh", 25);
    }
}
