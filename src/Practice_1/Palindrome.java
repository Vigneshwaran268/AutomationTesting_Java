package Practice_1;

public class Palindrome {

    public static void main(String[] args) {

        String str = "malayalam";
        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("The given string is palindrome");
        }
        else {
            System.out.println("The given string is not a palindrome");
        }
    }
}
