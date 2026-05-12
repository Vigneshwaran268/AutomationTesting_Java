package MethodOverRiding_1;

public class CreditCard extends PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Payment process through Credit Card");
    }
}
