package Operator;

public class VariableAndDatatypes {

    public static void main(String[]args){

        //Declare two integer variables assign values and print it
        int a = 5;
        int b = 6;
        System.out.println("First Integer: "+ a);
        System.out.println("Second Integer: "+ b);

        //Declare a double variable and integer variable and assign a value and print it
        double price = 19.99;
        int quantity = 5;
        System.out.println("Price: "+ price);
        System.out.println("Quantity: "+ quantity);

        //Declare a character variable and print it
        char initial = 'S';
        System.out.println("Initial: "+ initial);

        //Declare a boolean variable and display its result
        boolean d = true;
        System.out.println("Value: "+ d);

        //Print the values of int, double, char and boolean variables
        int age = 25;
        double price1 = 56.99;
        char initial1 = 'S';
        boolean isEmployed = true;
        System.out.println("Age: "+ age);
        System.out.println("Price: "+ price1);
        System.out.println("Initial: "+ initial1);
        System.out.println("Employment Status: "+ isEmployed);

        //Display the datatype of each variable used in the program
        int age1 = 25;
        double price2 = 56.99;
        char initial2 = 'S';
        boolean isEmployed1 = true;
        System.out.println("Age: "+ age1 +","+ "Datatype: Integer");
        System.out.println("Price: "+ price2 +","+ "Datatype: Double");
        System.out.println("Initial: "+ initial2 +","+ "Datatype: Character");
        System.out.println("Employment Status: "+ isEmployed1 +","+ "Datatype: Boolean");

        //Add two integer variable and print the result
        int x = 7;
        int y = 5;
        int sum;
        sum = x + y;
        System.out.println("Sum: " +sum);

        //Subtract two double variable and print the result
        double e = 78.98;
        double f = 67.78;
        double result = e - f;
        System.out.println("Result: " + result);

        //Multiply two byte variables and print the result
        byte i = 7;
        byte j = 5;
        int result1 = i * j;
        System.out.println("Result: "+result1);

        //Divide two integer variables and print the result
        int q = 7;
        int r = 5;
        int result3 = q/r;
        System.out.println("Result: "+ result3);

        //Find the remainder of two integer variable and print the result
        int s = 10;
        int t = 3;
        int remainder = s % t;
        System.out.println("Remainder is: "+ remainder);

        //Assign a value to the float variable and print the result
        float temperature = 99.8f;
        System.out.println("Temperature is: "+ temperature);

        //Assign values to two double variables and print them\
        double total_price = 69.99;
        double tax = 2.50;
        System.out.println("Total Price: "+ total_price);
        System.out.println("Tax: "+ tax);

        //Assign true or false to the boolean variable and print it
        boolean test_passed = true;
        System.out.println("Test Case Passed: "+ test_passed);

        //Change the value of boolean variable and print the result
        boolean is_Passed;
        is_Passed = false;
        is_Passed = true;
        System.out.println("Status: "+ is_Passed);

        //Add an integer and double variable and print the result
        int count = 5;
        double price3 = 67.99;
        double total = count + price3;
        System.out.println("Total: "+ total);

        //Multiply the double and integer variable and print the result
        double price4 = 89.99;
        int quantity1 = 3;
        double total1 = price4 * quantity1;
        System.out.println("Total: "+ total1);

        //Find the sum of three integer variables and print the result
        int num1 = 7;
        int num2 = 5;
        int num3 = 8;
        int sum1 = num1 + num2 + num3;
        System.out.println("Sum is: "+ sum1);

        //Find the average of three numbers and print the result
        int num4 = 10;
        int num5 = 20;
        int num6 = 30;
        int average = (num4 + num5 + num6) / 3;
        System.out.println("Average is: "+ average);





    }

}
