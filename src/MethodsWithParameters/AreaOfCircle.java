package MethodsWithParameters;

public class AreaOfCircle {

    public void circle(double radius){

        double area = 3.14 * radius * radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        AreaOfCircle obj = new AreaOfCircle();
        obj.circle(6.7);
    }
}
