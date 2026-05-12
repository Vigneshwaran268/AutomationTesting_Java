package MethodOverRiding;

public class Main_OnlinePayment {

    public static void main(String[] args) {
        OnlinePayment obj;
        obj = new CashPayment();
        obj.pay();

        obj = new CardPayment();
        obj.pay();

        obj = new UPIPayment();
        obj.pay();
    }
}
