package MethodOverloading;

public class Multiplication {

    public void multiply(int a, int b){
        System.out.println(a*b);
    }

    public void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }

    public static void main(String[] args) {
        Multiplication obj = new Multiplication();
        obj.multiply(2,2);
        obj.multiply(2,2,2);
    }
}
