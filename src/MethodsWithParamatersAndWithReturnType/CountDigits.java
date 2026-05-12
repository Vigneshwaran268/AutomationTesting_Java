package MethodsWithParamatersAndWithReturnType;

public class CountDigits {

    public int find(int n){
        int count = 0;

        while(n>0){
            count ++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigits obj = new CountDigits();
        int result = obj.find(12345);
        System.out.println(result);
    }
}
