package MethodsWithParamatersAndWithReturnType;

public class PrintReverse {

    public int reverse(int n){
        int rev = 0;

        while (n>0){
            rev = rev*10+n%10;
            n = n/10;

        }
        return rev;
    }

    public static void main(String[] args) {
        PrintReverse obj = new PrintReverse();
        int result = obj.reverse(4321);
        System.out.println(result);
    }
}
