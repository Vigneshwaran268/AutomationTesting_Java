package MethodOverRiding_1;

public class Main_ShapeDrawingSystem {

    public static void main(String[] args) {
        Shape obj;

        obj = new Circle();
        obj.draw();

        obj = new Rectangle();
        obj.draw();

        obj = new Triangle();
        obj.draw();
    }
}
