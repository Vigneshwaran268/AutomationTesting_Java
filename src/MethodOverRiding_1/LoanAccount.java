package MethodOverRiding_1;

public class LoanAccount extends BankAccount{

    @Override
    public void calculateInterest() {
        System.out.println("Loan Account Interest is 10%");
    }
}
