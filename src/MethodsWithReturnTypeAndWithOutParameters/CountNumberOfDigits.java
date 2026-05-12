package MethodsWithReturnTypeAndWithOutParameters;

public class CountNumberOfDigits {

    public int count(){
        int num = 1345;
        int count = 0;

        while (num>0){
            count++;
            num = num/10;

        }
        return count;
    }

    public static void main(String[] args) {
        CountNumberOfDigits obj = new CountNumberOfDigits();
        int c = obj.count();
        System.out.println(c);
    }
}
