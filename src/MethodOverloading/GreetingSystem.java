package MethodOverloading;

public class GreetingSystem {

    public void greet(){
        System.out.println("Welcome");
    }

    public void greet(String name){
        System.out.println("Welcome: "+name);
    }

    public void greet(String name, String time){
        System.out.println("Welcome: "+name+"@"+time);
    }

    public static void main(String[] args) {
        GreetingSystem obj = new GreetingSystem();
        obj.greet();
        obj.greet("Vikki");
        obj.greet("Vikki", "10.30 AM");
    }
}
