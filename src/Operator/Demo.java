package Operator;

public class Demo {
    public static void main(String[] args) {

        String day = "Diwali";

        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;

            case "Tuesday":
                System.out.println("Tuesday");
                break;

            case "Wednesday":
                System.out.println("Wednesday");
                break;

            case "Thursday":
                System.out.println("Thursday");
                break;

            case "Friday":
                System.out.println("Friday");
                break;

            case "Saturday":
                System.out.println("Saturday");
                break;

            case "Sunday":
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

        //Multiple switch

        String category = "Breakfast";
        String item = "Idly";
        String category1 = "Juice";
        String item1 = "Apple Juice";

        switch (category) {

            case "Breakfast":

                switch (item) {
                    case "Idly":
                        System.out.println("Idly");
                        break;

                    case "Dosai":
                        System.out.println("Dosai");
                        break;

                    default:
                        System.out.println("Invalid Breakfast");
                }
                break;
        }

        switch (category1) {
            case "Juice":

                switch (item1) {
                    case "Orange Juice":
                        System.out.println("Orange Juice");
                        break;

                    case "Apple Juice":
                        System.out.println("Apple juice");
                        break;

                    default:
                        System.out.println("Invalid juice");

                }
                break;
        }

        //Multiple switch1

        String type = "Two wheeler";
        String model = "Scooty";
        String type1 = "Four Wheeler";
        String model1 = "Bolero";

        switch (type){
            case "Two wheeler":

                switch (model){
                    case "FZ":
                        System.out.println("FZ");
                        break;

                    case "Scooty":
                        System.out.println("Scooty");
                        break;

                    default:
                        System.out.println("Invalid two wheeler");
                }
                break;
        }

        switch (type1){
            case "Four Wheeler":

                switch (model1){
                    case "Baleno":
                        System.out.println("Baleno");
                        break;

                    case "Bolero":
                        System.out.println("Bolero");
                        break;

                    default:
                        System.out.println("Invalid Four wheeler");
                }
                break;
        }




       }
    }

