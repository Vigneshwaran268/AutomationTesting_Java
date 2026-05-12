package Operator;

public class Demo1 {

    public static void main(String[]args){

        String signal = "Green";

        if(signal.equals("Green")){
            System.out.println("Go");
        }
        else if(signal.equals("Red")){
            System.out.println("Stop");
        }
        else if(signal.equals("Yellow")){
            System.out.println("Ready");
        }
        else {
            System.out.println("Invalid signal");
        }
    }
}
