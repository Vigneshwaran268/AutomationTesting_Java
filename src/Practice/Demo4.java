package Practice;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        while (a<=b){
            System.out.println(a);
            a++;
        }
    }
}
