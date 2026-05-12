package MethodsWithParamatersAndWithReturnType;

public class PrintInteger {

    public int print(int a){
        return a;
    }

    public static void main(String[] args) {
        PrintInteger obj = new PrintInteger();
        int i = obj.print(12);
        System.out.println(i);
    }
}
