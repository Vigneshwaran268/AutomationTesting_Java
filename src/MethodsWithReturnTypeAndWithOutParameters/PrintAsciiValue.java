package MethodsWithReturnTypeAndWithOutParameters;

public class PrintAsciiValue {

    public int Ascii(){
        char ch  = 'a';
        return (int) ch;
    }

    public static void main(String[] args) {
        PrintAsciiValue obj = new PrintAsciiValue();
        int n = obj.Ascii();
        System.out.println(n);
    }
}
