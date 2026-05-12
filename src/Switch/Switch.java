package Switch;

public class Switch {

    public static void main(String[] args) {


        String category = "Breakfast";
        String menu = "Pongal";
        String category1 = "Juice";
        String menu1 = "Apple Juice";

        switch (category){
            case "Breakfast":
                System.out.println("Select your breakfast");

                switch (menu){
                    case "Idly":
                        System.out.println("Idly");
                        break;

                    case "Dosai":
                        System.out.println("Dosai");
                        break;

                    case "Chapathi":
                        System.out.println("Chapathi");
                        break;

                    default:
                        System.out.println("Your breakfast is not available");
                }
                break;
        }

        switch (category1){
            case "Juice":
                System.out.println("Select your Juice");

                switch (menu1){
                    case "Apple Juice":
                        System.out.println("Apple Juice");
                        break;

                    case "Orange Juice":
                        System.out.println("Orange Juice");
                        break;

                    case "Grape Juice":
                        System.out.println("Grape Juice");
                        break;

                    default:
                        System.out.println("Your juice is not available");
                }
                break;
        }


    }
}
