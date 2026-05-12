package MethodsWithParameters;

public class PrintSumOfDigits {

    public void SumOfDigits(int num){
        int sum = 0;

        while(num>0){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        PrintSumOfDigits obj = new PrintSumOfDigits();
        obj.SumOfDigits(12345);
    }
}
