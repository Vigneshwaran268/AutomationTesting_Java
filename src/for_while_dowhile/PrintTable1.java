package for_while_dowhile;

import java.util.Scanner;

public class PrintTable1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();

        for(int i=1; i<=limit; i++){
            System.out.println(number+"x"+i+"="+(number*i));
        }
    }
}
