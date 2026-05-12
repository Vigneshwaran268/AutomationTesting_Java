package Practice;

import java.util.Scanner;

public class Demo9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        for(int i=1; i<=limit; i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
}
