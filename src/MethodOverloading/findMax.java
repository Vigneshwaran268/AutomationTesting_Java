package MethodOverloading;

public class findMax {

    public int max(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }

    public int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }

    public static void main(String[] args) {
        findMax obj = new findMax();
        int x = obj.max(1,2);
        System.out.println(x);
        int y = obj.max(7,8,9);
        System.out.println(y);
    }
}
