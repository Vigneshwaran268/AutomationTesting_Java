package MethodOverRiding_1;

public class VIPCustomer extends Customer{

    @Override
    public void getDiscount() {
        System.out.println("VIP customer gets 15% discount");
    }
}
