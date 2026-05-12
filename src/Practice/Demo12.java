package Practice;

import java.util.Scanner;

public class Demo12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        String rev = "";

        for(int i = name.length()-1; i>=0; i--){
            rev = rev+name.charAt(i);
        }
        if(rev.equals(name)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
