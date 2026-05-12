package Switch;

public class CalculatorUsingSwitch {

    public static void main(String[]args){

    int a = 7, b = 6;
    char operator = '-';

    switch (operator){
        case '+':
            System.out.println("Addition: "+(a+b));
            break;

        case '-':
            System.out.println("Subraction: "+(a-b));
            break;

        case '*':
            System.out.println("Multiplication: "+(a*b));
            break;

        case '/':
            System.out.println("Division: "+(a/b));
            break;

        default:
            System.out.println("Invalid Operator");
    }


}

    }
