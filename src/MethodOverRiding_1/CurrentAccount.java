package MethodOverRiding_1;

public class CurrentAccount extends BankAccount {

    @Override
    public void calculateInterest() {
        System.out.println("Current Account Interest is 7%");
    }
}
