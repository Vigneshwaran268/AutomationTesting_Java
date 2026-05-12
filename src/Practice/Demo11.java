package Practice;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        int i = 1;

        do{
            System.out.println(number+"*"+i+"="+(number*i));
            i++;
        }while (i<=limit);

    }
}
