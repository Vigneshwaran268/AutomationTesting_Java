package MethodsWithParameters;

public class PrintPalindrome {

    public void palindrome(int num){
        int rev = 0;
        int original = num;

        while(num>0){
            rev = rev*10+num%10;
            num = num/10;
        }

        if(original==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        PrintPalindrome obj = new PrintPalindrome();
        obj.palindrome(121);
    }
}
