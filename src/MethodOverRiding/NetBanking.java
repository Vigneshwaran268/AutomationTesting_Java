package MethodOverRiding;

public class NetBanking extends Payment{

    @Override
    public void pay(){
        System.out.println("Payment with netbanking");
    }
}
