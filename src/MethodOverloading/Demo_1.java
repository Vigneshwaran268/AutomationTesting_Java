package MethodOverloading;

public class Demo_1 {

    public void display(int i){
        System.out.println(i);
    }

    public void display(char c){
        System.out.println(c);
    }

    public void display(String s){
        System.out.println(s);
    }

    public void display(byte b){
        System.out.println((byte)b);
    }

    public static void main(String[] args) {
        Demo_1 obj = new Demo_1();
        obj.display(7);
        obj.display('S');
        obj.display("Vikki");
        obj.display((byte)12);
    }
}
