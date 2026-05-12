package MethodOverloading;

public class PrintSystem {

    public void print(int number){
        System.out.println(number);
    }

    public void print(float temperature){
        System.out.println(temperature);
    }

    public void print(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        PrintSystem obj = new PrintSystem();
        obj.print(56);
        obj.print("Vikki");
        obj.print(98.90f);
    }
}
