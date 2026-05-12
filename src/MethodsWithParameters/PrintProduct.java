package MethodsWithParameters;

public class PrintProduct {

    public void product(int a , int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        PrintProduct obj = new PrintProduct();
        obj.product(3,2);
    }
}
