package MethodOverRiding_1;

public class Main_OnlineShoppingDiscount {

    public static void main(String[] args) {
        Customer obj;

        obj = new RegularCustomer();
        obj.getDiscount();

        obj = new PrimeCustomer();
        obj.getDiscount();

        obj = new VIPCustomer();
        obj.getDiscount();
    }
}
