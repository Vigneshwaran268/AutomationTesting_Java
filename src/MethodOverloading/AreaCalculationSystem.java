package MethodOverloading;

public class AreaCalculationSystem {

    public void area(int side){
        System.out.println(side*side);
    }

    public void area(int length, int breadth){
        System.out.println(length*breadth);
    }

    public void area(double radius){
        System.out.println(Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        AreaCalculationSystem obj = new AreaCalculationSystem();
        obj.area(4);
        obj.area(3,3);
        obj.area(3.45);
    }
}
