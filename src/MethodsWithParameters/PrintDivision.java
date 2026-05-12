package MethodsWithParameters;

public class PrintDivision {

    public void division(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        PrintDivision obj = new PrintDivision();
        obj.division(8,2);
    }
}
