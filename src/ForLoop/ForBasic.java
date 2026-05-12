package ForLoop;

public class ForBasic {

    public static void main(String[] args) {

        //Print numbers from 1 to 10
        for(int a = 1; a<=10 ;a++){
            System.out.println(a);
        }
        System.out.println("____________________________________________________________________");

        //Print numbers from 10 to 1
        for(int b = 10; b>=1; b--){
            System.out.println(b);
        }
        System.out.println("---------------------------------------------------------------------");

        //Print even numbers from 1 to 50
        for(int c=1; c<=50; c++){
            if(c%2==0){
                System.out.println(c);
            }
        }
        System.out.println("_______________________________________________________________________");

        //Print odd numbers from 1 to 50
        for(int d=1; d<=50; d++){
            if(d%2!=0){
                System.out.println(d);
            }
        }
        System.out.println("_______________________________________________________________________");

        //Find the sum of n natural numbers
        int sum = 0;

        for(int e = 1; e<=5; e++){
            sum = sum+e;
        }
        System.out.println(sum);
        System.out.println("___________________________________________________________________");

        //Print multiplication table of a number
        int f = 5;
        for(int g=1; g<=10; g++){
            System.out.println(f+"x"+g+"="+(f*g));
        }
        System.out.println("________________________________________________________________");

        //Count digits in a number
        int num = 12345;
        int count = 0;

       while(num>0){
           num = num/10;
           count++;
       }
        System.out.println(count);




    }
}
