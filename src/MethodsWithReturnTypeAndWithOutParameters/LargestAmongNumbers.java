package MethodsWithReturnTypeAndWithOutParameters;

public class LargestAmongNumbers {

    public char largest(){
        int a = 5, b = 7, c = 9;

        if(a>b && a>c){
            return 'a';
        } else if (b>a && b>c) {
            return 'b';
        }
        else {
            return 'c';
        }
    }

    public static void main(String[] args) {
        LargestAmongNumbers obj = new LargestAmongNumbers();
        char c = obj.largest();
        System.out.println(c);
    }
}
