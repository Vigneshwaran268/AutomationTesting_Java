package Switch;

public class ATMMenuBySwitch {

    public static void main(String[] args){

        int operation = 4;
        switch (operation){
            case 1:
                System.out.println("Check balance");
                break;

            case 2:
                System.out.println("Deposit Amount");
                break;

            case 3:
                System.out.println("Withdraw Amount");
                break;

            default:
                System.out.println("Invalid Action");
        }
    }
}
