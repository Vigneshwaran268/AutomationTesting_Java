package MethodsWithParameters;

public class PrintPrime {

    public void prime(int n){
        boolean isPrime = true;

        if(n<=1){
            isPrime = false;
        }

        else {
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }


    public static void main(String[] args) {
        PrintPrime obj = new PrintPrime();
        obj.prime(18);
    }

}
