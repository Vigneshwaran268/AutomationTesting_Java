package MethodsWithReturnTypeAndWithOutParameters;

public class PrintFactorial {

    public int factorial(){
        int n = 5;
        int f = 1;

        for(int i = n; i>=1; i--){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        PrintFactorial obj = new PrintFactorial();
        int result = obj.factorial();
        System.out.println(result);

    }
}
