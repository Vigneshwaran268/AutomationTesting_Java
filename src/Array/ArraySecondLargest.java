package Array;

import java.util.Arrays;

public class ArraySecondLargest {

    public static void main(String[] args) {
        int[] score = {7,6,9,1,2};

        Arrays.sort(score);
        System.out.println(score[score.length-2]);
    }
}
