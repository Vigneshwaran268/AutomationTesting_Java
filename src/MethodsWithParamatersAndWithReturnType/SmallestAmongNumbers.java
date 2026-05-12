package MethodsWithParamatersAndWithReturnType;

public class SmallestAmongNumbers {

    public String smallest(int a, int b, int c){

        if(a<b && a<c){
            return "a is smallest";

        } else if (b<a && b<c) {
            return "b is smallest";
        }
        else {
            return "c is smallest";
        }
    }

    public static void main(String[] args) {
        SmallestAmongNumbers obj = new SmallestAmongNumbers();
        String result = obj.smallest(1,2,3);
        System.out.println(result);
    }
}
