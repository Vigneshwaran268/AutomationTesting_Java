package ForLoop;

public class GCDOfTwoNumbers {

    public static void main(String[] args) {

        int a = 78;
        int b = 90;
        int gcd = 1;
        int smaller = (a<b) ? a:b;

        for (int i = 2; i<=smaller; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);

    }
}
