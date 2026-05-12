package Array;

import java.util.Arrays;

public class SecondLargestInArray {

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        Arrays.sort(arr);

        int secondLargest = arr[arr.length-2];
        System.out.println("Second Largest Element: "+ secondLargest);


    }
}
