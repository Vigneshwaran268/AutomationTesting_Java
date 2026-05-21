package Array;

public class Practice {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Papaya"};
        String[] vegetables = {"Tomato", "Potato", "Carrot"};

        String[][] veg = {fruits, vegetables};
//            System.out.println(veg[1][0]);

        String[] seafoods = {"Fish", "Crab", "Prawn"};
        String[] meatfoods = {"Chicken", "Mutton", "Beef"};

        String[][] nonveg = {seafoods, meatfoods};

        String[][][] allProducts = {veg, nonveg};
//        System.out.println(allProducts[0][0][1]);
//        System.out.println(allProducts[1][0][1]);

//        for(int i=0; i<=allProducts.length-1; i++){
//            for(int j=0; j<=allProducts[i].length-1;j++){
//                for(int k=0; k<=allProducts[i][j].length-1; k++){
//                    System.out.println(allProducts[i][j][k]);
//                }
//            }
//        }

        for (int i = allProducts.length-1 ; i>=0 ; i--){
            for(int j=allProducts[i].length-1; j>=0;j--){
                for(int k= allProducts[i][j].length-1; k>=0; k--){
                    System.out.println(allProducts[i][j][k]);
                }
            }

        }

    }
}

