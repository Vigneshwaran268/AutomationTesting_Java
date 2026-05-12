package Practice;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        while(b>=a){
            System.out.println(b);
            b--;
        }
    }
}
