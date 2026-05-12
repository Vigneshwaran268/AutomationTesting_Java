package Operator;

public class Conditions {
    public static void main(String[]args){


        //Check if a number is positive
        int num = 9;

        if(num>0){
            System.out.println("The given number is positive");
        }


        //Check if a number is even
        int num1 = 8;
        if(num % 2 == 0){
            System.out.println("the given number is even");
        }


        //Check if a person is eligible to vote (age >=18)
        int age = 19;
        if(age>=18){
            System.out.println("Eligible to vote");
        }


        //Check if a number is divisible by 5
        int num2 = 25;
        if(num2 % 5 == 0){
            System.out.println("The number is divisible by 5");
        }


        //Check if a character is vowel
        char c = 'A';

        if(c == 'A' || c == 'E'|| c == 'I'  || c == 'O'  || c == 'U' || c == 'a' || c == 'e'|| c == 'i'  || c == 'o'  || c == 'u'){
            System.out.println("The character is vowel");
        }


        //Check if a number is greater than 100
        int num3 = 101;
        if(num > 100){
            System.out.println("The given number is greater than 100");
        }


        //Check if a year is century year
        int year = 2000;

        if(year % 100 == 0){
            System.out.println("The given year is century year");
        }

        //Check if number is even or odd
        int num4 = 16;
        if (num4 % 2 == 0){
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The given number is odd");
        }

        //Find the largest of two numbers
        int num5 = 87;
        int num6 = 89;
        if(num5 > num6){
            System.out.println("Num5 is largest");
        }
        else {
            System.out.println("Num6 is largest");
        }

        //Check if a number is positive or negative
        int num7 = 8;
        if(num > 0){
            System.out.println("The given number is positive");
        }
        else {
            System.out.println("The given number is negative");
        }

        //Check if a person passed or failed (pass mark = 40)
        int mark = 33;
        if(mark >= 40){
            System.out.println("The person is passed");
        }
        else {
            System.out.println("The person is failed");
        }

        //Check if a number is divisible by 2 or not
        int num8 = 88;
        if(num8 % 2 == 0){
            System.out.println("The given number is divisible by 2");
        }
        else {
            System.out.println("The given number is not divisible by 2");
        }

        //Check whether a number is multiple of 3 or not
        int num9 = 9;
        if(num9 % 3 == 0){
            System.out.println("The given number is multiple of 3");
        }
        else {
            System.out.println("The given number is not multiple of  3");
        }

        //Check if a character is uppercase or lowercase
        char ch = 'v';
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("The given character is in upper case");
        }
        else{
            System.out.println("THe given character is in lower case");
        }

        //Find the largest of three numbers.
        int num10 = 6;
        int num11 = 7;
        int num12 = 8;

        if(num10 > num11 && num10 > num12){
            System.out.println("Num10 is greatest");
        } else if (num11 > num10 && num11 > num12) {
            System.out.println("NUm11 is greatest");
        }
        else {
            System.out.println("Num12 is greatest");
        }

        //Grade a student based on marks
        int mark1 = 75;
        if(mark1 > 90){
            System.out.println("A grade");
        } else if (mark1 >= 75 && mark1 <= 89) {
            System.out.println("B grade");
        } else if (mark1 >= 54 && mark1 <= 74) {
            System.out.println("C grade");
        } else {
            System.out.println("Fail");
        }

        //Check if a number is positive or negative or zero
        int num13 = -6;
        if(num13 > 0){
            System.out.println("The given number is positive");
        } else if (num13 < 0) {
            System.out.println("The given number is negative");
        }
        else {
            System.out.println("The given number is Zero");
        }

        //Create a simple calculator (+, -, *, /)
         char operator = '*';
         int num14 = 3;
         int num15 = 5;
         if(operator == '+'){
             System.out.println("Result: "+(num14+num15));
         } else if (operator == '-') {
             System.out.println("Result: "+(num14-num15));
         } else if (operator == '*') {
             System.out.println("Result: "+(num14*num15));
         } else if (operator == '/') {
             System.out.println("Result: "+(num14/num15));
         }
         else {
             System.out.println("Invalid operator");
         }

         //Check if a year is a leap year
         int year1 = 2026;

         if(year1 % 400 == 0){
             System.out.println("The given year is leap year");
         } else if (year1 % 100 == 0) {
             System.out.println("The given year is not leap year");
         } else if (year1 % 4 == 0) {
             System.out.println("The given year is a leap year");
         }
         else {
             System.out.println("The given year is not a leap year");
         }

         //Categorize age group Child, Teen, Adult, Senior
         int age1 = 18;
         if(age1 <= 12){
             System.out.println("Child");
         } else if (age1 <= 19) {
             System.out.println("Teen");
         } else if (age1 <= 30) {
             System.out.println("Adult");
         }else {
             System.out.println("Senior");
         }

         //Check type of triangle based on sides Equilateral, Isosceles, Scalene
         int x = 5;
         int y = 6;
         int z = 5;
         if(x == y && y == z){
             System.out.println("The triangle is equilateral");
         } else if (x == y || y == z || x == z) {
             System.out.println("The triangle is isosceles");
         }else {
             System.out.println("The triangle is Scalene");
         }

         //Check if a character is Vowel, Consonant, Not an alphabet
         char c2 = 'V';
         if(c2 == 'A' || c2 == 'E' || c2 =='I' || c2 =='O' || c2 =='U' || c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 =='o' || c2 =='u'){
             System.out.println("The given character is Vowel");
         } else if ((c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z')) {
             System.out.println("The given character is consonant");
         }
         else {
             System.out.println("The given character is not an alphabet");
         }

    }

}
