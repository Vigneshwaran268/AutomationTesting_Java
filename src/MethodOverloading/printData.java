package MethodOverloading;

public class printData {

    public void show(int i){
        System.out.println(i);
    }

    public void show(double d){
        System.out.println(d);
    }

    public void show(String s){
        System.out.println(s);
    }

    public void show(char c){
        System.out.println(c);
    }

    public static void main(String[] args) {
        printData obj = new printData();
        obj.show(6);
        obj.show(3.14);
        obj.show("Vikki");
        obj.show('S');
    }
}
