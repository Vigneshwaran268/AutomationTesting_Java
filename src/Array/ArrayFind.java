package Array;

public class ArrayFind {


    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};
        int find = 30;
        boolean isFound = false;

        for (int i=0; i<arr.length; i++){
            if(arr[i]==find){
                isFound = true;
                break;
            }
            System.out.println(isFound);
        }


    }
}
