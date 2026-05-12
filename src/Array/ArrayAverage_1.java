package Array;

public class ArrayAverage_1 {

    public static void main(String[] args) {

        int[] mark = {10,20,30,40,50};
        int total = 0;

        for(int marks : mark){
            total = total+marks;
        }
        int avg = total/mark.length;
        System.out.println(avg);
    }
}
