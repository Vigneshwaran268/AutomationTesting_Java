package MethodOverRiding;

public class CashPayment extends OnlinePayment{

    @Override
    public void pay(){
        System.out.println("Payment through cash");
    }
}
