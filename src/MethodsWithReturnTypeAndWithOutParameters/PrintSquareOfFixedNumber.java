package MethodsWithReturnTypeAndWithOutParameters;

public class PrintSquareOfFixedNumber {

    public int square(){
        int n = 2;
        int result = n*n;
        return result;
    }

    public static void main(String[] args) {
        PrintSquareOfFixedNumber obj = new PrintSquareOfFixedNumber();
        int square = obj.square();
        System.out.println(square);
    }
}
