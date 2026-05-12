package MethodOverloading;

public class CalculateDiscount {

    public void calculate(int price, int discount){
        int finalPrice = price - (price * discount / 100);
        System.out.println(finalPrice);
    }

    public void calculate(int price, int discount, int add){
        int finalPrice = price - (price * discount / 100) + add;
        System.out.println(finalPrice);
    }

    public static void main(String[] args) {
        CalculateDiscount obj = new CalculateDiscount();
        obj.calculate(1000,10);
        obj.calculate(1000,10,50);
    }
}
