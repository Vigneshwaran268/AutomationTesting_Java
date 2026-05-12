package Practice;

import java.util.Scanner;

public class Demo17 {

    public void largest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is largest");
        } else if (b>a && b>c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }
    }

    public static void main(String[] args) {
        Demo17 obj = new Demo17();
        obj.largest();
    }
}
