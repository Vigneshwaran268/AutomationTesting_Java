package MethodsWithReturnTypeAndWithOutParameters;

public class SumOfDigits {

    public int sum(){
        int num = 12345;
        int sum = 0;

        while (num>0){
            int digits  = num%10;
            sum = sum+digits;
            num = num/10;
        }
        return sum;
    }

public static void main(String[] args) {
    SumOfDigits obj = new SumOfDigits();
    int i = obj.sum();
    System.out.println(i);
}
}

