package MethodsWithParamatersAndWithReturnType;

public class LargestAmongNumbers {

    public String largest(int a, int b, int c){

        if(a>b && a>c){
            return "a is largest";
        }
        else if(b>a && b>c){
            return "b is largest";
        }
        else {
            return "c is largest";
        }
    }

    public static void main(String[] args) {
        LargestAmongNumbers obj = new LargestAmongNumbers();
        String result = obj.largest(1,2,3);
        System.out.println(result);
    }
}
