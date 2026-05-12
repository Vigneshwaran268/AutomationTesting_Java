package for_while_dowhile;

import java.util.Scanner;

public class Sum_of_N_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();
        int sum = 0;

        for (int i = start; i<=end; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
