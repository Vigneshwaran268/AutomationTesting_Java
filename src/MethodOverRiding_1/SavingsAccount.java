package MethodOverRiding_1;

public class SavingsAccount extends BankAccount{

    @Override
    public void calculateInterest() {
        System.out.println("Savings Account Interset is 5%");
    }
}
