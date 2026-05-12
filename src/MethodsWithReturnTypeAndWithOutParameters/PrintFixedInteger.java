package MethodsWithReturnTypeAndWithOutParameters;

public class PrintFixedInteger {

    public int print(){
        return 18;
    }

    public static void main(String[] args) {
        PrintFixedInteger obj = new PrintFixedInteger();
        int  print = obj.print();
        System.out.println(print);
    }
}
