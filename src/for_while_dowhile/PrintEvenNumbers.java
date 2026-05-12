package for_while_dowhile;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending point point: ");
        int end = sc.nextInt();

        while(start<=end){
            if(start%2==0){
                System.out.println(start);

            }
            start++;
        }
    }
}
