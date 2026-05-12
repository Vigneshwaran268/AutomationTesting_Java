package MethodsWithParamatersAndWithReturnType;

public class PrintStringLength {

    public int print(String name){
        int size = name.length();
        return size;
    }

    public static void main(String[] args) {
        PrintStringLength obj = new PrintStringLength();
        int i = obj.print("Vikki");
        System.out.println(i);
    }


}
