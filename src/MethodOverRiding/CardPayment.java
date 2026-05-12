package MethodOverRiding;

public class CardPayment extends OnlinePayment{

    @Override
    public void pay(){
        System.out.println("Payment through card");
    }
}
