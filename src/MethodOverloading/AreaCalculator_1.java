package MethodOverloading;

public class AreaCalculator_1 {

    public void area(int side){
        System.out.println(side*side);
    }

    public void area(double radius){
        System.out.println(Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        AreaCalculator_1 obj = new AreaCalculator_1();
        obj.area(2);
        obj.area(3.50);
    }
}
