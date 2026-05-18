package Encapsulation;

public class BankAccount {
    private int acc_number;
    private String acc_holder_name;
    private int acc_balance;

    public void getter(int number, String name, int balance){
        acc_number = number;
        acc_holder_name = name;
        acc_balance = balance;
    }

    public int setnumber(){
        return acc_number;
    }
    public String setName(){
        return acc_holder_name;
    }
    public int setbalance(){
        return acc_balance;
    }
}

class MainClass_5{
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.getter(3010, "Vignesh", 3000);
        System.out.println("Account Number: "+obj.setnumber());
        System.out.println("Account Holder Name: "+obj.setName());
        System.out.println("Account Balance: "+obj.setbalance());
    }
}
