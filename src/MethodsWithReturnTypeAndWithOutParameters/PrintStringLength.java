package MethodsWithReturnTypeAndWithOutParameters;

public class PrintStringLength {

    public int length(){

        String str = "Vikki";
        return str.length();
    }

    public static void main(String[] args) {
        PrintStringLength obj = new PrintStringLength();
        int size = obj.length();
        System.out.println(size);
    }
}
