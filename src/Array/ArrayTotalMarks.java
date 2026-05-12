package Array;

public class ArrayTotalMarks {

    public static void main(String[] args) {

        int[] marks = {10,20,30,40,40};
        int total = 0;

        for(int i=0; i<marks.length; i++){
            total = total+marks[i];

        }
        int avg = total/marks.length;
        System.out.println(avg);
    }
}
