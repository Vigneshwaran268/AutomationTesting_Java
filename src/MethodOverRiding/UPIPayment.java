package MethodOverRiding;

public class UPIPayment extends OnlinePayment{

    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}
