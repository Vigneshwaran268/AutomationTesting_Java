package Array;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[]args){

        //Declare and initialize array
        int[] arr = {1,2,3,4,5};

        //Print all elements of an array
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }


    }
}
