package for_while_dowhile;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();

        do{
            System.out.println(number+"x"+i+"="+(number*i));
            i++;
        }while (i<=limit);

    }
}
