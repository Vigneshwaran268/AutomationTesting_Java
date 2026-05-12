package MethodsWithReturnTypeAndWithOutParameters;

public class PrintPyValue {

    public double py(){
        return Math.PI;
    }

    public static void main(String[] args) {
        PrintPyValue obj = new PrintPyValue();
       double py =  obj.py();
        System.out.println(py);
    }
}
