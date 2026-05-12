package MethodOverloading;

public class Sum {

    public void sumOfArray(int[] arr){
        int total = 0;
        for(int i=0; i<arr.length;i++){
            total = total + arr[i];
        }
        System.out.println(total);
    }

    public void sumOfInteger(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sumOfArray(new int[]{1,2,3});
        obj.sumOfInteger(10,20);
    }
}
