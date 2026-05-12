package MethodsWithParamatersAndWithReturnType;

public class SumOfDigits {

    public int find(int n){
        int sum = 0;

        while(n>0){
            int digits = n%10;
            sum = sum + digits;
            n = n/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        int result = obj.find(12345);
        System.out.println(result);
    }
}
