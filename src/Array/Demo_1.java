package Array;

import java.util.Arrays;

public class Demo_1 {

    public static void main(String[] args) {

        String[] arr = new String[3];
        arr[0] = "Tester";
        arr[1] = "Developer";
        arr[2] = "Manager";

        System.out.print("arr= ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
//        System.out.println(Arrays.toString(arr));
        }


    }
}

