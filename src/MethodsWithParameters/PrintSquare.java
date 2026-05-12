package MethodsWithParameters;

public class PrintSquare {

    public void square(int a){
        System.out.println(a*a);
    }

    public static void main(String[] args) {
        PrintSquare obj = new PrintSquare();
        obj.square(8);
    }
}
