package MethodsWithReturnTypeAndWithOutParameters;

public class SmallestAmongNumbers {

    public String smallest(){
        int a = 7, b = 9, c = 4;

        if(a<b && a<c){
            return "a is smallest";
        }
        else if(b<a && b<c){
            return "b is smallest";
        }
        else {
            return "c is smallest";
        }
    }

    public static void main(String[] args) {
        SmallestAmongNumbers obj = new SmallestAmongNumbers();
        String s = obj.smallest();
        System.out.println(s);
    }
}
