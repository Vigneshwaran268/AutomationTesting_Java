package Array;

public class GameScore {

    public static void main(String[] args) {

        int[] score = {10,20,30,40,50};
        int max = score[0];
        int min = score[0];

        for(int scores : score){
            if(scores>max){
                max = scores;
            }
            if(scores<min){
                min = scores;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
