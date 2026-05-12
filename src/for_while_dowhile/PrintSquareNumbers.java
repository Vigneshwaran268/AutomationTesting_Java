package for_while_dowhile;

import java.util.Scanner;

public class PrintSquareNumbers {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();

        for(int i = 1; i<=end; i++){
            System.out.println(i*i);
        }

    }
}
