package Pattern;

public class ReverseFloydsTriangle {

    public static void main(String[] args) {

        int rows = 5;
        int num = 1;

        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
