package MethodWithOutParameter;

public class MethodsPractice {


    //Print Hello,Java!
    public void print(){
        System.out.println("Hello, Java!");
    }


    //Create a method that prints numbers from 1 to 10.
    public void printNumbers(){
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }

    //Write a method to display all even numbers from 1 to 20.
    public void printEvenNumbers(){
        for (int i=1; i<=20; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    //Create a method that prints your name 5 times.
    public void printName(){
        String name = "Vignesh";
        for(int i = 1; i<=5; i++){
            System.out.println(name);
        }
    }

    //Write a method that prints the multiplication table of 5
    public void multiplicationTable(){
        int number = 2;
        int limit = 12;

        for(int i = 1; i<=limit; i++){
            System.out.println(number+"x"+i+"="+(number*i));
        }
    }

    //Create a method that prints the sum of numbers from 1 to 50 (calculate inside method)
    public void sum(){
        int sum = 0;
        for(int i = 1; i<=50; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }

    //Write a method to display the first 10 natural numbers in reverse.
    public void reverseNumbers(){
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }
    }

    //Write a method that prints all odd numbers between 1 and 100
    public void oddNumberPrint(){
        for (int i=1; i<=50; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    //Create a method that displays whether a fixed number (e.g., 25) is positive or negative
    public static void positiveOrNegative(){
        int num = 25;
        if(num > 0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }

    //Create a method that prints a simple star pattern (e.g., triangle)
    public static void traingleStarPrint(){
        for(int i = 1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        MethodsPractice method = new MethodsPractice();
        method.print();
        method.printNumbers();
        method.printEvenNumbers();
        method.printName();
        method.multiplicationTable();
        method.sum();
        method.reverseNumbers();
        method.oddNumberPrint();
        MethodsPractice.positiveOrNegative();
        traingleStarPrint();

    }
}
