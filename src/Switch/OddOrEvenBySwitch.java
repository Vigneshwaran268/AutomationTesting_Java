package Switch;

public class OddOrEvenBySwitch {

    public static void main(String[] args){
        int num = 65;
        int rem = num%2;

        switch (rem){
            case 0:
                System.out.println("Even");
                break;

            case 1:
                System.out.println("Odd");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
