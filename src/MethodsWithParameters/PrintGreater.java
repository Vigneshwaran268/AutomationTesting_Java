package MethodsWithParameters;

public class PrintGreater {

    public void greater(int a, int b){
        if(a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
    }

    public static void main(String[] args) {
        PrintGreater obj = new PrintGreater();
        obj.greater(5,1);
    }
}
