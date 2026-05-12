package MethodsWithParameters;

public class PrintFactorial {

    public void factorial(int n){
        int f = 1;

        for(int i=n; i>=1; i--){
            f=f*i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        PrintFactorial obj = new PrintFactorial();
        obj.factorial(6);
    }
}
