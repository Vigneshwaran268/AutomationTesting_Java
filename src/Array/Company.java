package Array;

public class Company {
    public static void main(String[] args) {
        String[] HR = {"Ravi", "Kumar"};
        String[] IT = {"Ajay", "Divya"};

        //System.out.println(HR[0]);
        //System.out.println(IT[0]);

        String[][] employee = {HR, IT};
        //System.out.println(employee[1][1]);

        String[] role = {"Tester", "Developer"};
        String[] level = {"Junior", "Senior"};

        String[][] designation ={role, level};
        String[][][] employees = {employee, designation};

        //System.out.println(employees[0][0][0]);
//        System.out.println(employees[0][1][0]);
//        System.out.println(employees[1][0][0]);

//        for(int i=0; i<=employees.length-1; i++){
//            for (int j=0; j<=employees[i].length-1; j++) {
//                for (int k=0; k<=employees[i][j].length-1; k++){
//                    System.out.println(employees[i][j][k]);
//                }
//            }
//        }

         for (int i=employees.length-1; i>=0; i--){
             for(int j=employees[i].length-1; j>=0; j--){
                 for(int k=employees[i][j].length-1; k>=0; k--){
                     System.out.println(employees[i][j][k]);
                 }
             }
         }



    }
}
