package MethodOverloading;

public class AreaCalculator {

    public void area(int side) {
        System.out.println(side * side);
    }

    public void area(double radius){
        System.out.println(Math.PI*radius*radius);
    }

    public void area(int length, int breadth){

        System.out.println(length*breadth);
    }

    public void area(double base, double height){

        System.out.println(0.5*base*height);
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.area(2);
        obj.area(3.0);
        obj.area(2,3);
        obj.area(2.0,3.0);
    }


}