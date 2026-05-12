package MethodsWithParamatersAndWithReturnType;

public class PrintFactorial {

    public int factorial(int n){
        int f = 1;

        for(int i=n; i>=1; i--){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        PrintFactorial obj = new PrintFactorial();
        int result = obj.factorial(5);
        System.out.println(result);
    }
}
