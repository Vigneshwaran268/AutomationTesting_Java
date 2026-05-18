package Encapsulation;

public class ATMSystem {

    private double balance;

    public void setBalance(double balanceAmount){
        balance = balanceAmount;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit Amount: "+amount);
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance = balance - amount;
            System.out.println("Withdraw amount: "+amount);
        }
        else {
            System.out.println("Insufficient Fund");
        }
    }

}

class MainClass_8{
    public static void main(String[] args) {
        ATMSystem obj = new ATMSystem();
        obj.setBalance(1000);
        obj.deposit(500);
        obj.withdraw(100);
        System.out.println(" Total Balance Amount: "+obj.getBalance());
    }
}
