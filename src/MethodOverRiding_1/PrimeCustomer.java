package MethodOverRiding_1;

public class PrimeCustomer extends Customer{

    @Override
    public void getDiscount() {
        System.out.println("Prime customer gets 10% discount");
    }
}
