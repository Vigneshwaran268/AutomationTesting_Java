package MethodOverloading;

public class CalculatorSystem {

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void add(double a, double b, double c){
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        CalculatorSystem obj = new CalculatorSystem();
        obj.add(2,3);
        obj.add(2,3,4);
        obj.add(31.2,6.90,8.75);
    }
}
