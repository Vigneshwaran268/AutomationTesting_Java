package for_while_dowhile;

import java.util.Scanner;

public class PrintReverseNumbersUsingDoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();

        do{
            System.out.println(end);
            end--;
        }while (end>=start);
    }
}
