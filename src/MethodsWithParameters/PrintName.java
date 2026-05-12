package MethodsWithParameters;

public class PrintName {

    public void print(String name){
        System.out.println("Welcome "+name);
    }

    public static void main(String[] args) {
        PrintName p = new PrintName();
        p.print("vikki");
    }
}
