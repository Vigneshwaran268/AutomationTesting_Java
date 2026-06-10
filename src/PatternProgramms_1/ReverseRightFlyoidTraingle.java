package PatternProgramms_1;

public class ReverseRightFlyoidTraingle {

    public static void main(String[] args) {

        int rows = 5;
        int num = 1;

        for (int i=rows; i>=1; i--){
            for (int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
