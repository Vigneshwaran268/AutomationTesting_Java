package MethodsWithReturnTypeAndWithOutParameters;

public class PrintCurrentYear {

    public int year(){
        return 2026;
    }

    public static void main(String[] args) {
        PrintCurrentYear obj = new PrintCurrentYear();
        int year = obj.year();
        System.out.println(year);
    }
}
