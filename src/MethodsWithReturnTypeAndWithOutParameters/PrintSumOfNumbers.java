package MethodsWithReturnTypeAndWithOutParameters;

public class PrintSumOfNumbers {

    public int sum(){
        int a = 7, b = 8;
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        PrintSumOfNumbers obj = new PrintSumOfNumbers();
        int i = obj.sum();
        System.out.println(i);
    }
}
