package MethodOverloading;

public class CalculateMethods {

    public void calculate(int a){
        System.out.println(a*a);
    }

    public void calculate(int a, int x){

        System.out.println(a*a*a);
    }

    public void calculate(int base, int exponent, int y){
        int total = 1;
        for(int i = 0; i<exponent; i++){
            total = total*base;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        CalculateMethods obj = new CalculateMethods();
        obj.calculate(2);
        obj.calculate(3, 1);
        obj.calculate(2,4,1);

    }
}
