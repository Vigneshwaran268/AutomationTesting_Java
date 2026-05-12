package MethodsWithParamatersAndWithReturnType;

public class PrintSum {

    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        PrintSum obj = new PrintSum();
        int sum = obj.add(7,2);
        System.out.println(sum);
    }
}
