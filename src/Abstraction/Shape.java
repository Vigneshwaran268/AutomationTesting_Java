package Abstraction;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape{
    void area(){
        int radius = 5;
        double area = Math.PI * radius *radius;
        System.out.println("Area of Circle: "+area);
    }
}

class Rectangle extends Shape{
    void area(){
        int length = 5;
        int breadth = 6;
        double area = length * breadth;
        System.out.println("Area of Rectangle: "+area);
    }
}

class MainClass_3{
    public static void main(String[] args) {
        Shape obj;
        obj = new Circle();
        obj.area();

        obj = new Rectangle();
        obj.area();
    }
}
