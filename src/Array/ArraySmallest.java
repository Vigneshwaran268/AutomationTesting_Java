package Array;

public class ArraySmallest {

    public static void main(String[]args){

        int[]arr = {10,20,40,30,50};
        int smallest = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element: "+ smallest);
    }
}
