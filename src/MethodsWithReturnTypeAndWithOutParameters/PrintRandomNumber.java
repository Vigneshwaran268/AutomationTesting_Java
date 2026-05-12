package MethodsWithReturnTypeAndWithOutParameters;

public class PrintRandomNumber {

    public int random(){

        return (int)(Math.random() *100);
    }

    public static void main(String[] args) {
        PrintRandomNumber obj = new PrintRandomNumber();
        int randomNumber = obj.random();
        System.out.println(randomNumber);
    }
}
