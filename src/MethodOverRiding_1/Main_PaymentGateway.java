package MethodOverRiding_1;

public class Main_PaymentGateway {

    public static void main(String[] args) {
        PaymentGateway obj;
        obj = new CreditCard();
        obj.processPayment();

        obj = new UPI();
        obj.processPayment();

        obj = new Paypal();
        obj.processPayment();
    }
}
