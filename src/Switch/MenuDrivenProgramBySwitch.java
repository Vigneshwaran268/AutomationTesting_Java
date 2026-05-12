package Switch;

public class MenuDrivenProgramBySwitch {

    public static void main(String[]args){

        int menu = 3;

        switch (menu){
            case 1:
                System.out.println("Tea");
                break;

            case 2:
                System.out.println("Coffee");
                break;

            case 3:
                System.out.println("Juice");
                break;

            default:
                System.out.println("Invalid menu");
        }
    }
}
