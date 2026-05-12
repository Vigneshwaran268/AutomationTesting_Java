package MethodsWithParamatersAndWithReturnType;

public class PrintPrime {

    public boolean prime(int n){


        if(n<=1){
            return false;
        }
        else {
            for(int i = 2; i<=n/2; i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        PrintPrime obj = new PrintPrime();
        boolean b = obj.prime(5);
        System.out.println(b);
    }
}
