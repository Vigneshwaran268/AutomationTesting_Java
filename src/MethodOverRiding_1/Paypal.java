package MethodOverRiding_1;

public class Paypal extends PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Payment process through Paypal");
    }
}
