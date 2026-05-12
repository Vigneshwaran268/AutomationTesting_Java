package MethodOverRiding;

public class ICICI extends Bank{

    @Override
    public void getRate(){
        System.out.println("Bank interest rate is 6%");
    }
}
