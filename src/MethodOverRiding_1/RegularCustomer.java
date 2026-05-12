package MethodOverRiding_1;

public class RegularCustomer extends Customer{

    @Override
    public void getDiscount() {
        System.out.println("Regular customer gets 5% discount");
    }
}
