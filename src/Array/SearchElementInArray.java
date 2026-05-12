package Array;

public class SearchElementInArray {

    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        int toSearch = 9;
        boolean found = false;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == toSearch){
                found = true;
            }
        }
        System.out.println(found);

    }

}
