package MethodsWithParamatersAndWithReturnType;

public class PrintNumberSquare {

    public int print(int a){
        return a*a;
    }

    public static void main(String[] args) {
        PrintNumberSquare obj = new PrintNumberSquare();
        int s = obj.print(2);
        System.out.println(s);
    }
}
