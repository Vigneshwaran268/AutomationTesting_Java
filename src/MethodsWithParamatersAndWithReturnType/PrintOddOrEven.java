package MethodsWithParamatersAndWithReturnType;

public class PrintOddOrEven {

    public String oddOrEven(int n){

        if(n%2==0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        PrintOddOrEven obj = new PrintOddOrEven();
        String str = obj.oddOrEven(5);
        System.out.println(str);
    }
}
