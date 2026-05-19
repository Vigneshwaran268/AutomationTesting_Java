package Abstraction;

abstract class Bank {
    abstract void interestRate();
    }


class SBI extends Bank{
    void interestRate(){
        System.out.println("SBI interest rate is 10%");
    }
}

class HDFC extends Bank{
    void interestRate(){
        System.out.println("HDFC interest rate is 15%");
    }
}

class MainClass_6{
    public static void main(String[] args) {
        Bank obj;
        obj = new SBI();
        obj.interestRate();

        obj = new HDFC();
        obj.interestRate();
    }
}
