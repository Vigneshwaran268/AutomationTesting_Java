package MethodsWithParameters;

public class PrintSum {

    public void sum(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        PrintSum obj = new PrintSum();
        obj.sum(1,2);
    }
}
