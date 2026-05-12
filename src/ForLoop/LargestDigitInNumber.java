package ForLoop;

public class LargestDigitInNumber {

    public static void main(String[] args) {
        int num = 7890;
        int largest = 0;

        while(num>0){
            if(num%10 > largest){
                largest = num %10;
            }
            num = num/10;
        }
        System.out.println(largest);

    }

}
