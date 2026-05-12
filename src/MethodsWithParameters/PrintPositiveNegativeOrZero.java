package MethodsWithParameters;

public class PrintPositiveNegativeOrZero {

    public void find(int a){

        if(a>0){
            System.out.println("a is positive");
        } else if (a<0) {
            System.out.println("a is negative");
        }else {
            System.out.println("a is zero");
        }
    }

    public static void main(String[] args) {
        PrintPositiveNegativeOrZero obj = new PrintPositiveNegativeOrZero();
        obj.find(-98);
    }
}
