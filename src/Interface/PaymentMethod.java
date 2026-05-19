/*. Payment Gateway System

Design a payment system using interfaces.

Requirements:

Create an interface PaymentMethod
Methods:
pay(double amount)
refund(double amount)
Implement classes:
CreditCardPayment
UPIPayment
PayPalPayment
Bonus:

Use polymorphism to process different payment methods dynamically.
interface PaymentMethod {
    void pay(double amount);
    void refund(double amount);
}

 */


package Interface;

interface PaymentMethod {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paid Amount: "+amount);
    }

    public void refund(double amount){
        System.out.println("Refunded Amount: "+amount);
    }
}

class UPIPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paid Amount: "+amount);
    }

    public void refund(double amount){
        System.out.println("Refunded Amount: "+amount);
    }
}

class PaypalPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paid Amount: "+amount);
    }

    public void refund(double amount){
        System.out.println("Refunded Amount: "+amount);
    }
}

class PaymentMain{
    public static void main(String[] args) {
        PaymentMethod obj;
        obj = new CreditCard();
        obj.pay(1500);
        obj.refund(1000);

        obj = new UPIPayment();
        obj.pay(2000);
        obj.refund(1500);

        obj = new PaypalPayment();
        obj.pay(2500);
        obj.refund(2000);
    }
}
