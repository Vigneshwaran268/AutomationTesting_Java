package MethodsWithReturnTypeAndWithOutParameters;

public class PerimeterOfRectangle {

    public int CheckPerimeter(){
        int length = 6;
        int breadth = 7;

        int perimeter = 2*(length+breadth);
        return perimeter;

    }

    public static void main(String[] args) {
        PerimeterOfRectangle obj = new PerimeterOfRectangle();
        int c = obj.CheckPerimeter();
        System.out.println(c);
    }
}
