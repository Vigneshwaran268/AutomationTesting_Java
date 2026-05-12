package MethodsWithParameters;

public class PrintEvenOrOdd {

    public void EvenOrOdd(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        PrintEvenOrOdd obj = new PrintEvenOrOdd();
        obj.EvenOrOdd(8);
    }
}
