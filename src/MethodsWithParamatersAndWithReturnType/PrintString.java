package MethodsWithParamatersAndWithReturnType;

public class PrintString {

    public String print(String name){
        return name;
    }

    public static void main(String[] args) {
        PrintString obj = new PrintString();
        String str = obj.print("Vikki");
        System.out.println(str);
    }
}
