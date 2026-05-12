package MethodOverRiding_1;

public class UPI extends PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Payment process through UPI");
    }
}
