package Operator;

public class LogicalOperator {

    public static void main(String[]args){

        //Check if 10 > 5 and 20 > 15
        System.out.println(10>5 && 20>15);

        //Check if 10 > 5 and 20 < 15
        System.out.println(10 > 5 || 20 < 15);

        //Use NOT operator to reverse true condition
        System.out.println(!true);

        //Check if two conditions are both false
        System.out.println(5>10 && 10<8);

        //Check if at least one condition is true
        System.out.println(10>5 || 20<30);

        //Combine three conditions using AND operator
        System.out.println(10>5 && 20>30 && 40>90);

        //Combine conditions using OR and AND
        System.out.println((10<15 || 30>35) && 12<6);

        //Negate a boolean variable
        boolean value = true;
        System.out.println(!value);

        //Check if the number is between 10 and 50
        int num = 16;
        if(num>10 && num<50){
            System.out.println("Number is between 10 and 50");
        }
        else{
            System.out.println("Number is not in between 10 and 50");
        }

        //Check if a number is divisible by 2 or 5 using ||
        int num1 = 12;

        if(num1 % 2 == 0 || num1 % 5 == 0){
            System.out.println("The number is divisible by 2 or 5");
        }
        else{
            System.out.println("The number is divisible by 2 or 5");
        }

        //Use ! operator to reverse a boolean value
        boolean value1 = true;
        System.out.println(!value1);

        //Check if a student passed (marks ≥ 40 AND attendance ≥ 75%).
        int mark = 78;
        int attendance = 80;

        if(mark >= 40 && attendance >=75){
            System.out.println("Student Pass");
        }
        else{
            System.out.println("Student Fail");
        }

        //Validate login using username AND password conditions
        String username = "Vikki";
        String password = "12345";

        if(username.equals("Vikki") && password.equals("12345")){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Failed");
        }

        //Check if the number is even and greater than 100
        int num2 = 65;

        if(num2 % 2 == 0 && num2 > 100){
            System.out.println("The number is even and greater than 100");
        }
        else{
            System.out.println("Condition not satisfied");
        }

        //Determine if a number is negative OR odd.
        int num3 = 8;
        if(num3 > 0 || num3 % 2 != 0){
            System.out.println("The given number is negative or odd");
        }
        else{
            System.out.println("The given number is neither negative nor odd");
        }

        //Write a program to check if a year is a leap year using logical operators.
        int year = 2026;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("The given year is leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }

        //Combine multiple conditions to validate age eligibility (e.g., 18–60).
        int age = 25;
        if(age >= 18 && age <= 60){
            System.out.println("Age is eligible");
        }
        else{
            System.out.println("Age is not eligible");
        }

        //Create a program that uses all three logical operators in a single condition
        int age1 = 25;
        if((age1 >= 18 && age1 <= 60) || !(age1 == 25)){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }

    }
}
