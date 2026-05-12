package MethodsWithParameters;

public class AreaOfRectangle {

    public void result(int length, int breadth){
        int area = length*breadth;
        System.out.println(area);
    }

    public static void main(String[] args) {
        AreaOfRectangle obj = new AreaOfRectangle();
        obj.result(6,8);
    }
}
