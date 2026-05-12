package for_while_dowhile;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; i<=end; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
