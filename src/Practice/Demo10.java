package Practice;

import java.util.Scanner;

public class Demo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        int i = 1;

        while(i<=limit){
            System.out.println(number+"*"+i+"="+(number*i));
            i++;
        }
    }
}
