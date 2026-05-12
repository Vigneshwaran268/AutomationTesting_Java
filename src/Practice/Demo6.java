package Practice;

import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        for(int i=b; i>=a; i--){
            System.out.println(i);
        }
    }
}
