package MethodsWithReturnTypeAndWithOutParameters;

public class CheckPrimeOrNot {

    public boolean check(){
        int num = 9;
        boolean isPrime = true;

        if(num<=1){
            return false;
        }
        else {
            for(int i = 2; i<=num/2; i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        CheckPrimeOrNot obj = new CheckPrimeOrNot();
        boolean b = obj.check();
        System.out.println(b);
    }

}
