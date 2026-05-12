package MethodsWithReturnTypeAndWithOutParameters;

public class PrintString {

    public String print(){
        return "Vikki";
    }

    public static void main(String[] args) {
        PrintString obj = new PrintString();
        String print = obj.print();
        System.out.println(print);
    }
}
