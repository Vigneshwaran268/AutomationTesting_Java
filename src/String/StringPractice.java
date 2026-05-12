package String;

import java.util.Locale;

public class StringPractice {

    public static void main(String[] args) {

        //Find the length of a given string
        String str = "Vignesh";
        System.out.println(str.length());


        //Convert a string to uppercase
        String str1 = "vignesh";
        System.out.println(str.toUpperCase());


        //Convert a string to lowercase
        String str2 = "VIGNESH";
        System.out.println(str.toLowerCase());


        //Remove leading and trailing spaces from a string
        String str3 = "  Automation Testing  ";
        System.out.println(str3.trim());


        //Check whether a string is empty
        String str4 = "Vikki";
        boolean b1 = str4.isEmpty();
        System.out.println(b1);


        //Concatenate two strings
        String str5 = "Automation";
        String str6 = "Testing";
        System.out.println(str5.concat(" "+str6));


        //Print each character of a string
        String str7 = "vignesh";
        for(int i = 0; i<=str7.length()-1; i++){
            System.out.println(str7.charAt(i));
        }


        //Reverse a string
        String str8 = "Vignesh";
        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev = rev+str8.charAt(i);
        }
        System.out.println(rev);


        //Check whether a string is a palindrome
        String str9 = "Madam";
        String rev1 = "";

        for(int i = str9.length()-1; i>=0; i--){
            rev1 = rev1+str9.charAt(i);
        }
        if(str9.equals(rev1)){
            System.out.println("The given string is palindrome");
        }
        else {
            System.out.println("The given string is not a palindrome");
        }


        //Count the number of vowels in a string
        String str10 = "vignesh";
        int count = 0;
        for(int i = 0; i<=str10.length()-1; i++){
            char ch = str10.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);


        //Count the number of consonants in a string
        String str11 = "automation";
        int count1 = 0;

        for(int i = 0; i<=str11.length()-1; i++){
            char ch1 = str11.charAt(i);

            if(ch1>='a' && ch1<='z' && ch1!='a'&& ch1!='e' && ch1!='i' && ch1!='o' && ch1!='u'){
                count1++;
            }
        }
        System.out.println(count1);


        //Remove all spaces from a string
        String str12 = "Learning Automation Testing";
        System.out.println(str12.replace(" ", ""));


        //Replace all occurrences of a character with another character
        String str13 = "Apple";
        System.out.println(str13.replace('p','a'));


        //Extract a substring from a string
        String str14 = "Vijay";
        System.out.println(str14.substring(0,2));


        //Check if a string starts with a specific word
        String str15 = "Vignesh";
        System.out.println(str15.startsWith("V"));


        //Check if a string ends with a specific word
        System.out.println(str15.endsWith("i"));


        //Compare two strings using different methods
        String str16 = "Vikki";
        String str17 = "Vikki";
        System.out.println(str16.equals(str17));


        //Count the number of words in a sentence
        String str18 = "Automation Testing class";
        String[] s = str18.split(" ");
        System.out.println(s.length);






    }
}
