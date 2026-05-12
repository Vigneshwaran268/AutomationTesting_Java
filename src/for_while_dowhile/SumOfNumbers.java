package for_while_dowhile;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();
        int sum = 0 ;

        while(start<=end){
            sum = sum+ start;
            start++;
        }
        System.out.println(sum);
    }
}
