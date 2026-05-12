package for_while_dowhile;

import java.util.Scanner;

public class PrintOddCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();

        int odd = 0;

        for(int i = start; i<=end; i++){
            if(i%2!=0){
                odd++;
            }
        }
        System.out.println(odd);

    }
}
