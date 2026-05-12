package MethodOverloading;

public class Numbers {

    public void printNumbers(int...num){
        System.out.println(num.length);
    }

    public void printNumbers(int a, int b){
        System.out.println(a+" "+b);
    }

    public void printNumbers(int a, int b, int c){
        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.printNumbers(1,2,3,4,5);
        obj.printNumbers(1,2);
        obj.printNumbers(1,2,3);
    }
}
