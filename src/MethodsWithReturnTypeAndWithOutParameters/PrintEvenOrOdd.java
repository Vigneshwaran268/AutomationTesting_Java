package MethodsWithReturnTypeAndWithOutParameters;

public class PrintEvenOrOdd {

    public String EvenOrOdd(){
        int n = 6;

        if(n%2==0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        PrintEvenOrOdd obj = new PrintEvenOrOdd();
        String s = obj.EvenOrOdd();
        System.out.println(s);
    }
}
