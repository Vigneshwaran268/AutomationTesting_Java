package MethodOverloading;

public class OnlinePayment {

    public void payment(int amount){
        System.out.println("Amount: "+amount);
    }

    public void payment(String card_num, int cvv, int amount){
        System.out.println("Card Number: "+card_num);
        System.out.println("CVV: "+cvv);
        System.out.println("Amount: "+amount);
    }

    public void payment(String UPI_ID, String bank_name, int amount){
        System.out.println("UPI ID: "+UPI_ID);
        System.out.println("Bank Name: "+bank_name);
        System.out.println("Amount: "+amount);
    }


    public static void main(String[] args) {
        OnlinePayment obj = new OnlinePayment();
        obj.payment(10000);
        obj.payment("123456789",768, 20000);
        obj.payment("CUB@123","State Bank", 30000);
    }
}
