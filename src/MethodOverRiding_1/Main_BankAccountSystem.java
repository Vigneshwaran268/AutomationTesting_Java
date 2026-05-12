package MethodOverRiding_1;

public class Main_BankAccountSystem {

    public static void main(String[] args) {
        BankAccount obj;
        obj = new CurrentAccount();
        obj.calculateInterest();

        obj = new SavingsAccount();
        obj.calculateInterest();

        obj = new LoanAccount();
        obj.calculateInterest();
    }
}
