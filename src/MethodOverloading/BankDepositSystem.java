package MethodOverloading;

public class BankDepositSystem {

    //Cash
    public void deposit(int amount){
        System.out.println("Amount: "+amount);
    }

    //Cheque
    public void deposit(int amount, int check_number){
        System.out.println("Amount: "+amount);
        System.out.println("Check Number: "+check_number);
    }

    //Online Transfer
    public void deposit(int amount, long acc_no, String bank_name){
        System.out.println("Amount: "+amount);
        System.out.println("Amount Number: "+acc_no);
        System.out.println("Bank Name: "+bank_name);
    }

    public static void main(String[] args) {
        BankDepositSystem obj = new BankDepositSystem();
        obj.deposit(10000);
        obj.deposit(20000, 8907);
        obj.deposit(30000, 5010245670898l, "HDFC");
    }
}
